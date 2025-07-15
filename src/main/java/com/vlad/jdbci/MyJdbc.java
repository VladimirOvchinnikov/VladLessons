package com.vlad.jdbci;

import com.vlad.jdbci.model.Class;
import com.vlad.jdbci.model.School;
import com.vlad.jdbci.model.Student;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class MyJdbc {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";


    public static void main(String[] args) throws Exception {
//        Student student = new Student();
//        student.setClassId(-1);// про не существующий id
//        student.setName("King java");
//        student.setSex(true);//про null
//        student.setBirthDay(LocalDate.of(1970, 10, 11));
//        student.setCreated(LocalDateTime.now().minusDays(3));
//        insertStudent(student);

        School school = new School();
        school.setName("досуг");
        school.setAddress("Греция");
        Class aClass = new Class();
        aClass.setName("тутут");
        aClass.setQuantity(1);
        aClass.setOpenClass(LocalDate.now());
        Student student = new Student();
        student.setName("Тот кому это надо");
        student.setSex(true);
        student.setBirthDay(LocalDate.of(1970, 10, 11));
        student.setCreated(LocalDateTime.now());
//        exampleTransactional(school, aClass, student);

        callFunction();

//        getAllClass();
//        getAllSchool();


//        executeSql("select id, s_name, address from schools", o -> {
//
//            try {
//                ResultSet rs = (ResultSet) o;
//                School school = new School();
//                school.setId(rs.getInt(1));
//                school.setName(rs.getString(2));
//                school.setAddress(rs.getString(3));
//                return school;
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//
//        });
    }

    public static void callFunction() {
        Connection conn = null;
        CallableStatement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
            statement = conn.prepareCall("select now_utc()");
            rs = statement.executeQuery();
            rs.next();
            System.out.println(rs.getTimestamp(1).toLocalDateTime());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (Objects.nonNull(rs)) {
                    if (!rs.isClosed()) {
                        rs.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(statement)) {
                    if (!statement.isClosed()) {
                        statement.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }

    public static void exampleTransactional(School school, Class aClass, Student student) throws Exception {
        Connection conn = null;
        PreparedStatement psSchool = null;
        PreparedStatement psClass = null;
        PreparedStatement psStudent = null;
        ResultSet rsSchool = null;
        ResultSet rsClass = null;

        String sqlInsertSchool = "INSERT INTO schools(s_name, address) VALUES (?, ?)";
        String sqlInsertClass = "INSERT INTO classes(school_id, c_name, quantity, open_class) VALUES (?, ?, ?, ?)";
        String sqlInsertStudent = "INSERT INTO students(class_id, s_name, sex, birth_day, created) VALUES (?, ?, ?, ?, ?) asdasdas";

        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
//            conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
            conn.setAutoCommit(false);
            psSchool = conn.prepareStatement(sqlInsertSchool, Statement.RETURN_GENERATED_KEYS);
            psSchool.setObject(1, school.getName());
            psSchool.setObject(2, school.getAddress());
            psSchool.executeUpdate();
            rsSchool = psSchool.getGeneratedKeys();
            rsSchool.next();
            aClass.setSchoolId(rsSchool.getInt(1));

            psClass = conn.prepareStatement(sqlInsertClass, Statement.RETURN_GENERATED_KEYS);
            psClass.setObject(1, aClass.getSchoolId());
            psClass.setObject(2, aClass.getName());
            psClass.setObject(3, aClass.getQuantity());
            psClass.setObject(4, aClass.getOpenClass());
            psClass.executeUpdate();
            rsClass = psClass.getGeneratedKeys();
            rsClass.next();
            student.setClassId(rsClass.getInt(1));
//            if (true){
//                throw new RuntimeException("11");
////                throw new Exception("11");
//            }

            psStudent = conn.prepareStatement(sqlInsertStudent);
            psStudent.setObject(1, student.getClassId());
            psStudent.setObject(2, student.getName());
            psStudent.setObject(3, student.getSex());
            psStudent.setObject(4, Date.valueOf(student.getBirthDay()));
            psStudent.setObject(5, student.getCreated());
            psStudent.execute();
//            conn.commit();
        } catch (SQLException e) {
            if (Objects.nonNull(conn)) {
                conn.rollback();
            }
            throw new Exception(e);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            if (Objects.nonNull(conn)) {
                conn.rollback();
            }
            throw e;
        } finally {
            try {
                if (Objects.nonNull(rsSchool)) {
                    if (!rsSchool.isClosed()) {
                        rsSchool.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(rsClass)) {
                    if (!rsClass.isClosed()) {
                        rsClass.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(psSchool)) {
                    if (!psSchool.isClosed()) {
                        psSchool.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(psStudent)) {
                    if (!psStudent.isClosed()) {
                        psStudent.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(psClass)) {
                    if (!psClass.isClosed()) {
                        psClass.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.commit();
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }


    public static void insertStudent(Student student) {

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
            statement = conn.prepareStatement("INSERT INTO students(class_id, s_name, sex, birth_day, created) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, student.getClassId());
            statement.setObject(2, student.getName());
            statement.setBoolean(3, student.getSex());
            statement.setDate(4, Date.valueOf(student.getBirthDay()));
            statement.setObject(5, student.getCreated());

            System.out.println(statement.execute());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (Objects.nonNull(rs)) {
                    if (!rs.isClosed()) {
                        rs.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(statement)) {
                    if (!statement.isClosed()) {
                        statement.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }

    }

    public static void getAllClass() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
            statement = conn.createStatement();
            rs = statement.executeQuery("select id, school_id,  c_name, quantity, open_class from classes");

            List<Class> classes = new ArrayList<>();

            while (rs.next()) {
                Class aClass = new Class();

                aClass.setId(rs.getInt("id"));
                aClass.setSchoolId(rs.getObject(2, Integer.class));
                aClass.setName(rs.getObject("c_name", String.class));
                aClass.setQuantity(rs.getInt(4));
                aClass.setOpenClass(rs.getDate(5).toLocalDate());

                classes.add(aClass);
            }

            System.out.println(classes.size());

            for (Class aClass : classes) {
                System.out.println(aClass);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (Objects.nonNull(rs)) {
                    if (!rs.isClosed()) {
                        rs.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(statement)) {
                    if (!statement.isClosed()) {
                        statement.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }

    public static void getAllStudent() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
            statement = conn.createStatement();
            rs = statement.executeQuery("select id, class_id, s_name, sex, birth_day, created from students");

            List<Student> students = new ArrayList<>();

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setClassId(rs.getInt(2));
                student.setName(rs.getString(3));
                student.setSex(rs.getBoolean(4));//rs.getObject(4, Boolean.class)
                student.setBirthDay(rs.getDate(5).toLocalDate());
                student.setCreated(rs.getTimestamp(6).toLocalDateTime());
                students.add(student);
            }

            System.out.println(students.size());

            for (Student student : students) {
                System.out.println(student);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (Objects.nonNull(rs)) {
                    if (!rs.isClosed()) {
                        rs.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(statement)) {
                    if (!statement.isClosed()) {
                        statement.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }

    public static void getAllSchool() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "postgres");
            statement = conn.createStatement();
            rs = statement.executeQuery("select id, s_name, address from schools");

            List<School> schools = new ArrayList<>();

            while (rs.next()) {
                School school = new School();
                school.setId(rs.getInt(1));
                school.setName(rs.getString(2));
                school.setAddress(rs.getString(3));
                schools.add(school);
            }

            System.out.println(schools.size());

            for (School school : schools) {
                System.out.println(school);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (Objects.nonNull(rs)) {
                    if (!rs.isClosed()) {
                        rs.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(statement)) {
                    if (!statement.isClosed()) {
                        statement.close();
                    }
                }
            } catch (Exception ignore) {
            }
            try {
                if (Objects.nonNull(conn)) {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }


    public static void getAllSchoolV2() {

        try (Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("select id, s_name, address from schools")) {

            List<School> schools = new ArrayList<>();

            while (rs.next()) {
                School school = new School();
                school.setId(rs.getInt(1));
                school.setName(rs.getString(2));
                school.setAddress(rs.getString(3));
                schools.add(school);
            }
            System.out.println(schools.size());
            for (School school : schools) {
                System.out.println(school);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void executeSql(String sql, Function functionMap) {
        try (Connection conn = DriverManager.getConnection(URL, "postgres", "postgres");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            List<School> schools = new ArrayList<>();

            while (rs.next()) {
                schools.add((School) functionMap.apply(rs));
            }
            System.out.println(schools.size());
            for (School school : schools) {
                System.out.println(school);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

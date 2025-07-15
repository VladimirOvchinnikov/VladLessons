package com.vlad.jdbci.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

    private Integer id;
    private Integer classId;
    private String name;
    private Boolean sex;
    private LocalDate birthDay;
    private LocalDateTime created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", class_id=" + classId +
                ", s_name='" + name + '\'' +
                ", sex=" + sex +
                ", birh_day=" + birthDay +
                ", created=" + created +
                '}';
    }
}

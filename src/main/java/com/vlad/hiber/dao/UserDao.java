package com.vlad.hiber.dao;

import com.vlad.hiber.entity.User;
import com.vlad.hiber.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public User create(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(user);
            user = session.merge(user);
            System.out.println(user);
            tx.commit();
            return user;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException("create");
        }

    }


    public User update(User user) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(user);
            user = session.merge(user);
            System.out.println(user);
            tx.commit();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }

            throw new RuntimeException("update");
        }
    }

    public void delete(Integer id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            User user = new User();
            user.setId(id);
            session.remove(user);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("delete " + id);
        }
    }

    public User findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findById " + id);
        }
    }


    public List<User> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<User> users = session.createSelectionQuery("from User", User.class).list();

            return users;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findAll");
        }
    }
}

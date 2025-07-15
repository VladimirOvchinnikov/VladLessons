package com.vlad.hiber.dao;

import com.vlad.hiber.entity.Book;
import com.vlad.hiber.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDao {
    public Book create(Book book) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(book);
            book = session.merge(book);
            System.out.println(book);
            tx.commit();
            return book;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException("create");
        }
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JavaRush" );
//        EntityManagerFactory emf = HibernateUtil.getSessionFactory();
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        book = em.merge(book);
//        em.getTransaction().commit();
//        System.out.println(book);
//        return  book;
    }


    public Book update(Book book) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(book);
            book = session.merge(book);
            System.out.println(book);
            tx.commit();
            return book;
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
            Book book = new Book();
            book.setId(id);
            session.remove(book);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("delete " + id);
        }
    }

    public Book findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Book.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findById " + id);
        }
    }


    public List<Book> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            List<Book> books = session.createQuery("from Book", Book.class).list();
            List<Book> books = session.createSelectionQuery("from Book", Book.class).list();

//            for (Book b: books){
//                b.getLibrary().getName();
//            }

            return books;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findAll");
        }
    }


}

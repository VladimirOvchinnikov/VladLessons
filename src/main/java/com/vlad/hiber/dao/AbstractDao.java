package com.vlad.hiber.dao;

import com.vlad.hiber.entity.ObjEntity;
import com.vlad.hiber.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AbstractDao<T extends ObjEntity> {


//    public T create(T library) {
//        Transaction tx = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            tx = session.beginTransaction();
//            System.out.println(library);
//            library = session.merge(library);
//            System.out.println(library);
//            tx.commit();
//            return library;
//        } catch (Exception e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            e.printStackTrace();
//            throw new RuntimeException("create");
//        }
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JavaRush" );
////        EntityManagerFactory emf = HibernateUtil.getSessionFactory();
////        EntityManager em = emf.createEntityManager();
////        em.getTransaction().begin();
////        library = em.merge(library);
////        em.getTransaction().commit();
////        System.out.println(library);
////        return  library;
//    }
//
//
//    public T update(T library) {
//        create(library);
////        Transaction tx = null;
////        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
////            tx = session.beginTransaction();
////            System.out.println(library);
////            library = session.merge(library);
////            System.out.println(library);
////            tx.commit();
////            return library;
////        } catch (Exception e) {
////            e.printStackTrace();
////            if (tx != null) {
////                tx.rollback();
////            }
////
////            throw new RuntimeException("update");
////        }
//    }
//
//
//    public void delete(T id) {
//        Transaction tx = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            tx = session.beginTransaction();
////            T library = new T();
////            library.setId(id);
//            session.remove(id);
//            tx.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("delete " + id);
//        }
//    }
//
//    public T findById(Integer id) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            return session.get(T.class, id);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("findById " + id);
//        }
//    }
//
//
//    public List<T> findAll() {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
////            List<T> librarys = session.createQuery("from T", T.class).list();
//            List<T> librarys = session.createSelectionQuery("from T", T.class).list();
////            List<T> librarys = session.(T.class);
//            return librarys;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("findAll");
//        }
//    }

}

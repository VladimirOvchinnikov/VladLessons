package com.vlad.hiber.dao;

import com.vlad.hiber.entity.Library;
import com.vlad.hiber.util.HibernateUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class LibraryDao {

    public Library create(Library library) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(library);
            library = session.merge(library);
            System.out.println(library);
            tx.commit();
            return library;
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
//        library = em.merge(library);
//        em.getTransaction().commit();
//        System.out.println(library);
//        return  library;
    }


    public Library update(Library library) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            System.out.println(library);
            library = session.merge(library);
            System.out.println(library);
            tx.commit();
            return library;
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
            Library library = new Library();
            library.setId(id);
            session.remove(library);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("delete " + id);
        }
    }


    public void delete(Library o) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.remove(o);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("delete " + o.getId());
        }
    }

    public Library findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Library.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findById " + id);
        }
    }


    public List<Library> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            List<Library> librarys = session.createQuery("from Library", Library.class).list();
            List<Library> librarys = session.createSelectionQuery("from Library", Library.class).list();
//            librarys.forEach(l -> l.getBooks().size());
//            List<Library> librarys = session.(Library.class);
            return librarys;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("findAll");
        }
    }


    public void sss(Library l) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(l);
            if (true) {
                Integer k = l.getBooks().size();

                k++;
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa " + k);
                System.out.println("zzzzzz");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.vlad.hiber;


import com.vlad.hiber.dao.BookDao;
import com.vlad.hiber.dao.LibraryDao;
import com.vlad.hiber.dao.UserDao;
import com.vlad.hiber.entity.Book;
import com.vlad.hiber.entity.Library;
import com.vlad.hiber.entity.User;
import com.vlad.hiber.util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiberMain {

    public static void main(String[] args) {
        LibraryDao libraryDao = new LibraryDao();
        BookDao bookDao = new BookDao();
        UserDao userDao = new UserDao();

        Library library1 = new Library();
        library1.setName("ssss");

        System.out.println(library1);
        library1 = libraryDao.create(library1);

        Library library2 = new Library();
//        library2.setId(library1.getId());
        library2.setName("ssss111111");
        System.out.println(library2);
        library2 = libraryDao.update(library2);


//        libraryDao.delete(-1);

        Library library3 = libraryDao.findById(library2.getId());

        List<Library> libraries = libraryDao.findAll();


        Book book1 = new Book();
        book1.setName("B1");
        book1.setDescription("D1");
        book1.setLibrary(library2);
        book1 = bookDao.create(book1);

        Book book2 = new Book();
        book2.setName("B2");
        book2.setDescription("D2");
        book2.setLibrary(library2);
        book2 = bookDao.create(book2);

        List<Book> books = bookDao.findAll();
        System.out.println(books);

        User u1 = new User();
        u1.setFullName("f1");
        u1.setBooks(new ArrayList<>(Arrays.asList(book1, book2)));
        u1 = userDao.create(u1);

        User u2 = new User();
        u2.setFullName("f2");
        u2.setBooks(new ArrayList<>(Arrays.asList(book1, book2)));
        u2 = userDao.create(u2);

        List<User> users = userDao.findAll();
        System.out.println(users.size());

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        userDao.delete(u1.getId());//эх((((((((((

//        for (Book b: books){
//            Library l = b.getLibrary();
//            Integer id = l.getId();
//            String name = l.getName();
//            System.out.println("aaaa " + id + " " + name);
////            System.out.println(b.getLibrary().getId());
//        }

//        List<Library> libraries1 = libraryDao.findAll();

//        for (Library l: libraries1){
//            System.out.print("Lib = " + l.getName() +" ");
//            libraryDao.sss(l);
//            System.out.print(" size = " + l.getBooks().size() + " ");
//            for (Book b: l.getBooks()) {
//                System.out.print("book = " + b.getName() + " ");
//            }
//            System.out.println();
//        }
//        libraryDao.delete(library2);

        HibernateUtil.shutdown();
        System.out.println("1111111");
    }


//    BookService bookService = new BookService();
//        LibraryService libraryService = new LibraryService();
//        UserService userService = new UserService();
//
//        Library library = new Library();
//        library.setName("Lib 1");
//        library = libraryService.create(library);
//
//
//        Book book = new Book();
//        book.setName("B1");
//        book.setDescription("D1");
////        book.setLibraryId(library.getId());
//        book.setLibrary(library);
//        book= bookService.create(book);
//
//        Book book1 = new Book();
//        book1.setName("B2");
//        book1.setDescription("D2");
////        book1.setLibraryId(library.getId());
//        book1.setLibrary(library);
//        book1 = bookService.create(book1);
//
//        List<Book> books = bookService.findAll();
//        System.out.println(books.size());
//
//        List<Library> libraries = libraryService.findAll();
//        System.out.println(libraries.size());
//
//        User u1 = new User();
//        u1.setFullName("f1");
//        u1.setBooks(new ArrayList<>(Arrays.asList(book, book1)));
//        userService.create(u1);
//
//        User u2 = new User();
//        u2.setFullName("f2");
//        u2.setBooks(new ArrayList<>(Arrays.asList(book, book1)));
//        userService.create(u2);
//
//
//        List<User> users = userService.findAll();
//        System.out.println(users.size());
//
//        System.out.println("asdadsa");
//        HibernateUtil.shutdown();
//        System.out.println("1111111");




}

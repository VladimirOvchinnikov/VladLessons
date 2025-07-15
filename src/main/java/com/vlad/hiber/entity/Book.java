package com.vlad.hiber.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
//    @Column(name = "library_id", nullable = false)
//    private Integer libraryId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "books", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<User> users;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    //    public Integer getLibraryId() {
//        return libraryId;
//    }
//
//    public void setLibraryId(Integer libraryId) {
//        this.libraryId = libraryId;
//    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
//                ", libraryId=" + libraryId +
                '}';
    }
}

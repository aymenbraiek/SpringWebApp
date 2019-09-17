package com.example.SpringWebApp.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    @OneToOne
    private PubLisher pubLisher;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private Set<Author> authors = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pubLisher='" + pubLisher + '\'' +
                ", authors=" + authors +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book() {
    }

    public Book(String title, String isbn, PubLisher pubLisher) {
        this.title = title;
        this.isbn = isbn;
        this.pubLisher = pubLisher;
    }

    public Book(String title, String isbn, PubLisher pubLisher, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.pubLisher = pubLisher;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public PubLisher getPubLisher() {
        return pubLisher;
    }

    public void setPubLisher(PubLisher pubLisher) {
        this.pubLisher = pubLisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authorss) {
        this.authors = authorss;
    }
}

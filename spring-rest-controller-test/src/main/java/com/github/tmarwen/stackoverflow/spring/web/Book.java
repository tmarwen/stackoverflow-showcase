package com.github.tmarwen.stackoverflow.spring.web;

import java.util.Objects;

public class Book {

    private String name;

    private String authorName;

    private String isbn;

    public Book() {
    }

    public Book(String name, String authorName, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && Objects.equals(authorName, book.authorName) && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, isbn);
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getIsbn() {
        return isbn;
    }
}

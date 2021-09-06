package com.github.tmarwen.stackoverflow.spring.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    private static final Map<String, Book> books = new HashMap<>();

    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public @ResponseBody Book makeBook(@RequestBody Book b) {
        books.put(b.getName(), b);
        System.out.println(b);
        return b;
    }

    @GetMapping
    public @ResponseBody
    Collection<Book> allBooks() {
        return books.values();
    }
}

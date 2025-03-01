package com.example.vijay.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/books")
@Tag(name = "Book API", description = "API for managing books")
public class BookController {

    @GetMapping
    @Operation(summary = "Get all books", description = "Fetches all available books")
    public List<String> getAllBooks() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a book by ID", description = "Fetches a specific book by ID")
    public String getBookById(@PathVariable int id) {
        return "Book " + id;
    }

    @PostMapping
    @Operation(summary = "Add a new book", description = "Adds a new book to the list")
    public String addBook(@RequestParam String name) {
        return "Book '" + name + "' added successfully";
    }
}


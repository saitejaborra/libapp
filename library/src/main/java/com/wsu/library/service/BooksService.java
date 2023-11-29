package com.wsu.library.service;

import com.wsu.library.entities.Books;
import com.wsu.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    public List<Books> returnAllBooks() {
        return booksRepository.findAll();
    }

}

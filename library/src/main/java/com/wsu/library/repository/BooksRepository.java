package com.wsu.library.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsu.library.entities.Books;

public interface BooksRepository extends JpaRepository<Books, BigInteger> {


}

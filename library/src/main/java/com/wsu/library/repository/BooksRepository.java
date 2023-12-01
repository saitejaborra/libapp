package com.wsu.library.repository;

import java.math.BigInteger;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wsu.library.entities.Books;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface BooksRepository extends JpaRepository<Books, BigInteger> {
    @Modifying
    @Transactional
    @Query(value = "update books set available_copies= available_copies-1 where id = :bookId", nativeQuery = true)
void updateBook(@Param("bookId") BigInteger bookId);
}

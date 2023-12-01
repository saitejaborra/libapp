package com.wsu.library.repository;

import com.wsu.library.entities.Loans;
import com.wsu.library.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;

public interface LoansRepository extends JpaRepository<Loans, BigInteger> {

    @Query(value = "select * from loans where borrower_id= :studentId", nativeQuery = true)
    List<Loans> findLoansByID(@Param("studentId") String studentId);
}

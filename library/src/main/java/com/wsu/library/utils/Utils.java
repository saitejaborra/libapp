package com.wsu.library.utils;

import com.wsu.library.entities.Loans;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class Utils {

    public static Loans LoansDtoMapper(String memberId, BigInteger bookId){
        Loans loans = new Loans();
        LocalDate localDate = LocalDate.now();
        loans.setBookId(bookId);
        loans.setBorrowerId(memberId);
        loans.setDateBorrowed(localDate);
        loans.setDueDate(localDate.plusDays(30));
        loans.setStatus(true);
        loans.setIssuedStaffId("d562b168");
        return loans;
    }
}

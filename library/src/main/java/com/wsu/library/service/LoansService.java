package com.wsu.library.service;

import com.wsu.library.entities.Loans;
import com.wsu.library.entities.LoansDTO;
import com.wsu.library.repository.BooksRepository;
import com.wsu.library.repository.FacultyRepository;
import com.wsu.library.repository.LoansRepository;
import com.wsu.library.repository.StudentsRepository;
import com.wsu.library.utils.Utils;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class LoansService {

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private StudentsRepository studentsRepository;

    @Autowired
    private FacultyRepository facultyRepository;

    public List<Loans> returnAllLoansByStudent(String studentId) {
        return loansRepository.findLoansByID(studentId);
    }

    public Optional<List<Loans>> addNewLoans(String memberId, BigInteger bookId, String memberType) {
        if (memberType.equals("student") && studentsRepository.findById(memberId).isPresent()
    || memberType.equals("faculty") && facultyRepository.findById(memberId).isPresent()) {
            Loans loans = Utils.LoansDtoMapper(memberId, bookId);
            loansRepository.save(loans);
            booksRepository.updateBook(bookId);
        }
        return Optional.ofNullable(loansRepository.findLoansByID(memberId));
    }
}

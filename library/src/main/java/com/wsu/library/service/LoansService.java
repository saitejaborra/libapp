package com.wsu.library.service;

import com.wsu.library.entities.Loans;
import com.wsu.library.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoansService {

    @Autowired
    private LoansRepository loansRepository;

    public List<Loans> returnAllLoansByStudent(String studentId) {
        return loansRepository.findLoansByID(studentId);
    }
}

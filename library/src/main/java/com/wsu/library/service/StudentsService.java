package com.wsu.library.service;

import com.wsu.library.entities.Students;
import com.wsu.library.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<Students> returnAllStudents() {
        return studentsRepository.findAll();
    }

    public Optional<Students> getStudentById(String id) { return studentsRepository.findById(id);}
}

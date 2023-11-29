package com.wsu.library.service;

import com.wsu.library.entities.Staff;
import com.wsu.library.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public Optional<Staff> getFacultyById(String id) {
        return facultyRepository.findById(id);
    }
}

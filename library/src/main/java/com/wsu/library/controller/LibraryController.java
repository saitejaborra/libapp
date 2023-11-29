package com.wsu.library.controller;


import java.util.List;
import java.util.Optional;

import com.wsu.library.entities.Loans;
import com.wsu.library.entities.Staff;
import com.wsu.library.entities.Students;
import com.wsu.library.service.BooksService;
import com.wsu.library.service.FacultyService;
import com.wsu.library.service.LoansService;
import com.wsu.library.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wsu.library.entities.Books;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/library")
@Slf4j
@CrossOrigin(origins="*")
public class LibraryController {

    @Autowired
    private BooksService booksService;

	@Autowired
	private StudentsService studentsService;

	@Autowired
	private FacultyService facultyService;

	@Autowired
	private LoansService loansService;
	@GetMapping("/books")
	private ResponseEntity<List<Books>> getBooks() {
		return ResponseEntity.ok(booksService.returnAllBooks());
	}

	@GetMapping("/students")
	private ResponseEntity<List<Students>> getStudents(){
		return ResponseEntity.ok(studentsService.returnAllStudents());
	}

	@GetMapping("/studentbyid")
	private ResponseEntity<Optional<Students>> getStudentById(@RequestParam String id) {
		return ResponseEntity.ok(studentsService.getStudentById(id));
	}

	@GetMapping("facultybyid")
	private ResponseEntity<Optional<Staff>> getFacultyById(@RequestParam String id) {
		return ResponseEntity.ok((facultyService.getFacultyById(id)));
	}

	@GetMapping("/loans")
	private ResponseEntity<List<Loans>> getLoansByIDs(@RequestParam String studentId) {
		return ResponseEntity.ok(loansService.returnAllLoansByStudent(studentId));
	}

}

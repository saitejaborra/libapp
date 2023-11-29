package com.wsu.library.repository;

import com.wsu.library.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Staff, String> {
}

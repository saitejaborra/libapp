package com.wsu.library.repository;

import com.wsu.library.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, String> {

}

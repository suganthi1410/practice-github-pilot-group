package com.example.practiceclassmanager.repository;

import com.example.practiceclassmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
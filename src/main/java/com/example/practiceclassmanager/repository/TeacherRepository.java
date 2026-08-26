package com.example.practiceclassmanager.repository;

import com.example.practiceclassmanager.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
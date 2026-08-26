package com.example.practiceclassmanager.controller;

import com.example.practiceclassmanager.exception.ResourceNotFoundException;
import com.example.practiceclassmanager.model.Teacher;
import com.example.practiceclassmanager.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Teacher not found with id " + id));
    }
}
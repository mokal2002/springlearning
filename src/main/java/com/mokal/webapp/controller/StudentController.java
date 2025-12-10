package com.mokal.webapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mokal.webapp.dto.StudentDTO;
import com.mokal.webapp.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    // @GetMapping("/student/{id}")
    // public List<StudentDTO> getStudentById(@PathVariable Long id) {
    //     return studentService.getStudentById(id);
    // }
}

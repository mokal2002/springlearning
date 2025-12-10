package com.mokal.webapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mokal.webapp.dto.StudentDTO;
import com.mokal.webapp.entity.Student;
import com.mokal.webapp.respository.StudentRepository;
import com.mokal.webapp.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map(student -> new StudentDTO(student.getId(), student.getName(), student.getEmail()))
                .toList();

    }

}

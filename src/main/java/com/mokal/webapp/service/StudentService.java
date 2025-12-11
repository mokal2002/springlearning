package com.mokal.webapp.service;

import java.util.List;


import com.mokal.webapp.dto.AddStudentRequestDTO;
import com.mokal.webapp.dto.StudentDTO;

public interface StudentService {

    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    StudentDTO createNewStudent(AddStudentRequestDTO addStudentRequestDTO);

    void deleteStudentById(Long id);
    
}

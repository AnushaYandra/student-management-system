package org.anusha.studentmanagementsystem.service;

import org.anusha.studentmanagementsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService{
    List<Student> getAllStudents();
    void saveStudents(Student student);
    Student getStudentById(Long id);
    void updateStudent(Student student);

    void deleteStudentById(Long id);
}

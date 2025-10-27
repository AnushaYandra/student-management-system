package org.anusha.studentmanagementsystem.service;

import org.anusha.studentmanagementsystem.entity.Student;
import org.anusha.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudents(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}

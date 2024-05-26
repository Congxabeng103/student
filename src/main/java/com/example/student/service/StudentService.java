package com.example.student.service;

import com.example.student.model.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);

    List<Student> getAllStudents();
}

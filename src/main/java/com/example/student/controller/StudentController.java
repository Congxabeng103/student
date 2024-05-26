package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    @CrossOrigin
    public ResponseEntity<String> add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return ResponseEntity.ok("new student is added");
    }


    @GetMapping("/getAll")
    @CrossOrigin
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

}

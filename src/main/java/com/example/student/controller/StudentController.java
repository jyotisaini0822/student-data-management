package com.example.student.controller;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:5173")
@Transactional
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }

}


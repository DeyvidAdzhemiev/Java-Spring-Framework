package com.university.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.demo.request.CreateStudentRequest;
import com.university.demo.response.StudentResponse;
import com.university.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public StudentResponse createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
        return studentService.createStudent(createStudentRequest);
    }

    @GetMapping("getById/{id}")
    public StudentResponse getById (@PathVariable long id) {
        return studentService.getById(id);
    }
}

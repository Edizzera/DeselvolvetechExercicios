package com.example.stepbystep.controllers;

import com.example.stepbystep.beans.Student;
import com.example.stepbystep.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRetrieveController {


    @GetMapping("/student/allstudent")
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }

}

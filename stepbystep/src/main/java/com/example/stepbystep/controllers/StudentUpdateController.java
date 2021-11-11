package com.example.stepbystep.controllers;

import com.example.stepbystep.beans.Student;
import com.example.stepbystep.beans.StudentRegistration;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentUpdateController {


    @PutMapping("/update/student")
    public String updateStudentRecord(@RequestBody Student stdn) {
        System.out.println("In updateStudentRecord");
        return StudentRegistration.getInstance().upDateStudent(stdn);
    }
}

package com.example.stepbystep.controllers;

import com.example.stepbystep.beans.Student;
import com.example.stepbystep.beans.StudentRegistration;
import com.example.stepbystep.beans.StudentRegistrationReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRegistrationController {


    @PostMapping("/register/student")
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        //We are setting the below value just to reply a message back to the caller
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");

        return stdregreply;
    }

}

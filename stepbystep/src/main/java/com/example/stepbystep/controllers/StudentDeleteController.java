package com.example.stepbystep.controllers;

import com.example.stepbystep.beans.StudentRegistration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDeleteController {



    @DeleteMapping("/delete/student/{regdNum}")
    public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
        System.out.println("In deleteStudentRecord");
        return StudentRegistration.getInstance().deleteStudent(regdNum);
    }

}

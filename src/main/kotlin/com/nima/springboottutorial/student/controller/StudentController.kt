package com.nima.springboottutorial.student.controller

import com.nima.springboottutorial.StudentBuilder
import com.nima.springboottutorial.student.model.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/student")
class StudentController {
    @GetMapping
    fun getStudent(): List<Student> {
        return StudentBuilder().build(number = 10)
    }
}
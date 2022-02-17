package com.nima.springboottutorial.student.controller

import com.nima.springboottutorial.student.model.Student
import com.nima.springboottutorial.student.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/student")
class StudentController(@Autowired private val studentService: StudentService) {

    @GetMapping
    fun getStudent(@RequestParam(value = "number", defaultValue = "5") number: String): List<Student> {
        return studentService.getStudent(number)
    }
}
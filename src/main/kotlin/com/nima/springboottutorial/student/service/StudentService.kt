package com.nima.springboottutorial.student.service

import com.nima.springboottutorial.StudentBuilder
import com.nima.springboottutorial.student.model.Student
import org.springframework.stereotype.Service

@Service
class StudentService {

    fun getStudent(number: String): List<Student> {
        return StudentBuilder().build(number = number.toInt())
    }
}
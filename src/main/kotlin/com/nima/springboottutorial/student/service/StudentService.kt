package com.nima.springboottutorial.student.service

import com.nima.springboottutorial.student.model.Student
import com.nima.springboottutorial.student.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(@Autowired private val studentRepository: StudentRepository) {

    fun getStudent(number: String): List<Student> {
        val results = studentRepository.findAll()
        println("getStudent: $results")
        return results
    }
}
package com.nima.springboottutorial.student.repository

import com.nima.springboottutorial.student.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {

}
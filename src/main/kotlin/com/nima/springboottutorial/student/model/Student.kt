package com.nima.springboottutorial.student.model

import java.time.LocalDate

data class Student(
    var id: Long? = null,
    var name: String,
    var age: Int,
    var dob: LocalDate,
    var email: String
) {
    override fun toString(): String {
        return "Student(id=$id, name='$name', age=$age, dob=$dob, email='$email')"
    }
}
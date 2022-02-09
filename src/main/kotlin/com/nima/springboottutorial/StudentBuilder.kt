package com.nima.springboottutorial

import com.nima.springboottutorial.student.model.Student
import java.time.LocalDate
import java.time.Month

class StudentBuilder {
    private val result = ArrayList<Student>()
    fun build(
        number: Int = 5,
        id: Long? = null,
        name: String = "Nima",
        email: String = "NimaAbdpoor@gmail.com",
        age: Int = 20,
        date: LocalDate = LocalDate.of(2022, Month.APRIL, 28)
    ): List<Student> {
        for (x in 0..number)
            result.add(
                Student(
                    id = id,
                    name = name + if (x > 0) x.toString() else "",
                    email = email + if (x > 0) x.toString() else "",
                    age = age + x,
                    dob = date
                )
            )
        return result
    }
}
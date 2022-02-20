package com.nima.springboottutorial.student.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    var id: Long? = null
    private var name: String = ""
    private var age: Int = 0
    private var dob: LocalDate = LocalDate.of(2000,2,28)
    private var email: String? = null

    constructor(id: Long?, name: String, age: Int, dob: LocalDate, email: String?) {
        this.id = id
        this.name = name
        this.age = age
        this.dob = dob
        this.email = email
    }

    constructor(name: String, age: Int, dob: LocalDate, email: String?) {
        this.name = name
        this.age = age
        this.dob = dob
        this.email = email
    }

    constructor()


    override fun toString(): String {
        return "Student(id=$id, name='$name', age=$age, dob=$dob, email='$email')"
    }
}
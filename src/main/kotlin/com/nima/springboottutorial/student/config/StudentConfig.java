package com.nima.springboottutorial.student.config;

import com.nima.springboottutorial.StudentBuilder;
import com.nima.springboottutorial.student.model.Student;
import com.nima.springboottutorial.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            StudentBuilder builder = new StudentBuilder();
            List<Student> students = builder.build(5,null, "Nima", "Nimaabdpoor@gmail.com",
                    20, LocalDate.of(2022, Month.APRIL, 28));
            System.out.println(students);
            repository.saveAll(students);
        };
    }
}

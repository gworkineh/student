package com.example.student_crud.student;

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
            Student Mariam = new Student(
                    "Workineh",
                    "workineh@yahoo.com",
                    LocalDate.of(1980, Month.JUNE,11)
            );
            Student Meaza = new Student(
                    "Meaza",
                    "meaza@yahoo.com",
                    LocalDate.of(2003, Month.JANUARY,12)
            );
            Student Dawit = new Student(
                    "Dawit",
                    "dawit@yahoo.com",
                    LocalDate.of(1978, Month.JANUARY,12)
            );
            Student Dawit2 = new Student(
                    "Dawit2",
                    "dawit@yahoo.com",
                    LocalDate.of(1900, Month.JANUARY,12)
            );
            repository.saveAll(
                    List.of(Mariam,Meaza,Dawit,Dawit2)
            );
        };
    }
}

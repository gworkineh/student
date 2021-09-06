package com.example.student_crud.instructor;

import com.example.student_crud.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InstructorConfig {
    @Bean
    CommandLineRunner commandLineRunner2 (InstructorRepository instructorRepository){
        return args -> {
           Instructor Workineh = new Instructor(
               "Ayele",
               "Introduction To Computer Scince",
               "ayele@yahoo.com",
               "Masters"
           );
            Instructor Ayele = new Instructor(
                "Getachew",
                "Introduction To Computer Scince",
                "getachew@yahoo.com",
                "Doctor"
            );
            instructorRepository.saveAll(
                    List.of(Workineh, Ayele)
            );
        };
    }
}

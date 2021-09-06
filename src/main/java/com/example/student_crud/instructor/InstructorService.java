package com.example.student_crud.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    public void addNewInstructor(Instructor instructor) {
        System.out.println(instructor);
    }
    public void deleteInstructor(Long instructorId){
        instructorRepository.deleteById(instructorId);
    }
}

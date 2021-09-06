package com.example.student_crud.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/instructor")
public class InstructorController {
    private final InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }
    @GetMapping
    public List<Instructor> getInstrucors(){
        return instructorService.getInstructors();
    }
    @PostMapping
    public void registerNewInstructor(@RequestBody Instructor instructor){
       instructorService.addNewInstructor(instructor);
    }
    @DeleteMapping(path = "instructorId")
    public void deleteInstructor(
        @PathVariable("instructorId") Long instructorId){
            instructorService.deleteInstructor(instructorId);
        }
}


package com.example.student_crud.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentAService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentAService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
      return studentAService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentAService.addNewStudent(student);
    }


}

package com.example.student_crud.instructor;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table
public class Instructor {
    @Id
    @SequenceGenerator(
            name = "instructor_sequence",
            sequenceName =  "instructor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "instructor_sequence"
    )
    private Long id;
    private String instructor_name;
    private String course_name;
    private String email;
    private String education_level;

    public Instructor(){}

    public Instructor(Long id, String instructor_name, String course_name, String email, String education_level) {
        this.id = id;
        this.instructor_name = instructor_name;
        this.course_name = course_name;
        this.email = email;
        this.education_level = education_level;
    }

    public Instructor(String instructor_name, String course_name, String email, String education_level) {
        this.instructor_name = instructor_name;
        this.course_name = course_name;
        this.email = email;
        this.education_level = education_level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", instructor_name='" + instructor_name + '\'' +
                ", course_name='" + course_name + '\'' +
                ", email='" + email + '\'' +
                ", education_level='" + education_level + '\'' +
                '}';
    }
}

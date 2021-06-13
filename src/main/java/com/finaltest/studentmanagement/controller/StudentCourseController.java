package com.finaltest.studentmanagement.controller;

import com.finaltest.studentmanagement.model.Course;
import com.finaltest.studentmanagement.model.Student;
import com.finaltest.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCourseController {

    @Autowired
    StudentService studentService;

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);

    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return studentService.getAllCourses();
    }

    @GetMapping("/students/{name}/courses")
    public List<Course> getCourseForStudent(@PathVariable(name = "name") String name) {

        return studentService.getCourseForStudent(name);
    }


}

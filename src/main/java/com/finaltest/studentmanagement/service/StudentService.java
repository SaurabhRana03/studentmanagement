package com.finaltest.studentmanagement.service;


import com.finaltest.studentmanagement.Exception.StudentNotFoundException;
import com.finaltest.studentmanagement.model.Course;
import com.finaltest.studentmanagement.model.Student;
import com.finaltest.studentmanagement.repository.CourseRepo;
import com.finaltest.studentmanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    CourseRepo courseRepo;


    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student findStudent(String name) {
        return studentRepo.findByStuName(name);
    }

    public ResponseEntity<Object> deleteStudent(Student stu) {
        studentRepo.delete(stu);
        return ResponseEntity.ok().build();
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<Course> getCourseForStudent(String name) {
        List courseName = new ArrayList<>();

        try{
            studentRepo.findByStuName(name).getCourses();
        }catch(NullPointerException ne){
            throw new StudentNotFoundException("Student not Found with this name");
        }

        List<Course> courses = studentRepo.findByStuName(name).getCourses();

        for (Course course : courses) {
            courseName.add(course.getCourseName());
        }
        return courseName;
    }

}

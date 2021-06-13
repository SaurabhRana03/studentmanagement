package com.finaltest.studentmanagement.repository;

import com.finaltest.studentmanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}

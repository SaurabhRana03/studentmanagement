package com.finaltest.studentmanagement.repository;

import com.finaltest.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByStuName(String name);
}

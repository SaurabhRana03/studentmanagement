package com.finaltest.studentmanagement.model;


import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private int stuId;
    private  String stuName;

    @ManyToMany(cascade =  CascadeType.ALL)
    private List<Course> courses;
}

package com.sample.cruddemo.dao;

import com.sample.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> allStudents();
    void registerStudent(Student student);
    Student getById(int id);
    Student removeStudent(int id);
}

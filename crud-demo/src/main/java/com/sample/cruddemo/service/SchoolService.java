package com.sample.cruddemo.service;

import com.sample.cruddemo.entity.Student;

import java.util.List;

public interface SchoolService {

    List<Student> findall();
    void register(Student student);
    Student get(int id);
    Student delete(int id);
}

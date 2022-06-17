package com.sample.cruddemo.service;

import com.sample.cruddemo.dao.StudentDAO;
import com.sample.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> findall() {
        return studentDAO.allStudents();
    }

    @Override
    public void register(Student student) {
        studentDAO.registerStudent(student);
    }

    @Override
    public Student get(int id) {
        return studentDAO.getById(id);
    }

    @Override
    public Student delete(int id) {
        return studentDAO.removeStudent(id);
    }
}

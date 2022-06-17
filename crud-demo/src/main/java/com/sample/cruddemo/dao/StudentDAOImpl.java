package com.sample.cruddemo.dao;

import com.sample.cruddemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Student> allStudents() {
        // Create a session from entity manager
        Session session = entityManager.unwrap(Session.class);
        // Create a Query from session object
        Query<Student> query = session.createQuery("from Student",Student.class);
        // Get result from Query
        List<Student> list = query.getResultList();
        return list;
    }

    @Override
    @Transactional
    public void registerStudent(Student student) {
        // Create  a session object from entity manager
        Session session = entityManager.unwrap(Session.class);
        // Create a Query from session
        session.saveOrUpdate(student);
    }

    @Override
    @Transactional
    public Student getById(int id) {
        // Create a session object from entity manager
        Session session = entityManager.unwrap(Session.class);
        return session.get(Student.class,id);
    }

    @Override
    @Transactional
    public Student removeStudent(int id) {
        // Create a session object from entity manager
        Session session = entityManager.unwrap(Session.class);
        // Create a query from session
        Student student= getById(id);
        session.remove(student);
        return student;
    }
}

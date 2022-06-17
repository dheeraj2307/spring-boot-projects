package com.sample.cruddemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    public Student(int id, String firstName, String lastName, String email) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Student() {

    }

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


}

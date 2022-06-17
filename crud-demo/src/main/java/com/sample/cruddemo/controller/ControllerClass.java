package com.sample.cruddemo.controller;

import com.sample.cruddemo.entity.Student;
import com.sample.cruddemo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerClass {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String welcomeMessage(){
        return "welcome to school home page";
    }

    @GetMapping(value = "/allstudentslist")
    public List<Student> allStudentsList(){
        return schoolService.findall();
    }

    @PostMapping(value = "/register")
    public void registerStudent(@RequestBody Student student){
        schoolService.register(student);
    }

    @GetMapping("/getstudent/{id}")
    public Student getStudent(@PathVariable int id){
        return schoolService.get(id);
    }

    @DeleteMapping("/remove/{id}")
    public Student removeStudent(@PathVariable  int id){
        return schoolService.delete(id);
    }


}

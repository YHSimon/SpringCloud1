package com.study.controller;

import com.study.entity.Student;
import com.study.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {


    @Autowired
    private StudentRepository studentRepository;


    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
       return  studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return  studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrupdate(student);
    }

    @PutMapping("/update")
    public  void update(@RequestBody Student student){
        studentRepository.saveOrupdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口号："+this.port;
    }
}

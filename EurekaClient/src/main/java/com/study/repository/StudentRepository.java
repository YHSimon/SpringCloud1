package com.study.repository;

import com.study.entity.Student;

import java.util.Collection;
import java.util.Map;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrupdate(Student student);
    public void deleteById(long id);
}

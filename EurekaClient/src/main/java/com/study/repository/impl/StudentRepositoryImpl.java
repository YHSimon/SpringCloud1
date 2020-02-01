package com.study.repository.impl;

import com.study.entity.Student;
import com.study.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> map;
    static {
        map=new HashMap<>();
        map.put(1L,new Student(1L,"张三",23));
        map.put(2L,new Student(2L,"李四",24));
        map.put(3L,new Student(3L,"王五",25));

    }
    @Override
    public Collection<Student> findAll() {
        return map.values();
    }

    @Override
    public Student findById(long id) {
        return map.get(id);
    }

    @Override
    public void saveOrupdate(Student student) {
        map.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        map.remove(id);
    }
}

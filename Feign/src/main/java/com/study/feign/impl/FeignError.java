package com.study.feign.impl;

import com.study.entity.Student;
import com.study.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "系统正在维护中...";
    }
}

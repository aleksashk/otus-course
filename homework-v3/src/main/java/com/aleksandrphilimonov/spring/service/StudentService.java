package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.domain.Student;

public interface StudentService {
    Student setName();
    String getFullName(Student student);
}

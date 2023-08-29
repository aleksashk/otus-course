package com.aleksandrphilimonov.spring.dao;

import com.aleksandrphilimonov.spring.domain.Student;

public interface StudentDao {
    Student createStudent(String firstName, String lastName);
}

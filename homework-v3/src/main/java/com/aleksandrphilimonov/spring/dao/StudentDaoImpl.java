package com.aleksandrphilimonov.spring.dao;

import com.aleksandrphilimonov.spring.domain.Student;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student createStudent(String firstName, String lastName) {
        return new Student(firstName, lastName);
    }
}

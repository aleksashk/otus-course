package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.dao.StudentDao;
import com.aleksandrphilimonov.spring.domain.Student;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;
    private final ConsoleService consoleService;

    @Override
    public Student setName() {
        String firstName = consoleService.getStringWithMessage("Please enter your firstName: ");
        String lastName = consoleService.getStringWithMessage("Please enter your lastName: ");
        return studentDao.createStudent(firstName, lastName);
    }

    @Override
    public String getFullName(Student student) {
        return student.getFirstName() + " " + student.getLastName();
    }
}

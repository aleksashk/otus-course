package com.aleksandrphilimonov.spring.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Student")
public class StudentTest {

    @DisplayName("корректно создается конструктором")
    @Test
    void shouldHaveCorrectConstructor() {
        Student student = new Student("Roman", "Strukov");

        assertEquals("Roman", student.getFirstName());
        assertEquals("Strukov", student.getLastName());
    }
}
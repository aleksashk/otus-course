package com.aleksandrphilimonov.spring.util;

import com.aleksandrphilimonov.spring.model.Exam;

public interface CsvReader {
    Exam getAsExam() throws Exception;
}

package com.aleksandrphilimonov.spring;

import com.aleksandrphilimonov.spring.util.CsvReader;
import com.aleksandrphilimonov.spring.util.ExamPrinterSimple;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        CsvReader csvReader = context.getBean(CsvReader.class);
        ExamPrinterSimple examPrinterSimple = context.getBean(ExamPrinterSimple.class);
        examPrinterSimple.print(csvReader.getAsExam());
    }
}
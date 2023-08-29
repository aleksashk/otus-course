package com.aleksandrphilimonov.spring;

import com.aleksandrphilimonov.spring.dao.TestQuestionDao;
import com.aleksandrphilimonov.spring.service.TestQuestionService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("/spring-context.xml");
        TestQuestionService questionsService = context.getBean(TestQuestionService.class);
        TestQuestionDao questionDao = context.getBean(TestQuestionDao.class);
        questionsService.setStudent();
        questionsService.conductTesting(context.getResource(questionDao.getResource()));
    }
}
package com.aleksandrphilimonov.spring;

import com.aleksandrphilimonov.spring.service.QuestionService;
import com.aleksandrphilimonov.spring.service.QuestionaryServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");

        QuestionService questionService = context.getBean(QuestionService.class);
        QuestionaryServiceImpl questionaryService = context.getBean(QuestionaryServiceImpl.class);

        questionaryService.runQuestionary(questionService.getQuestionList());
    }
}
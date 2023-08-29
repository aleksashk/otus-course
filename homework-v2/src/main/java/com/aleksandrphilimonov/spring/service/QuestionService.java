package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionList();
}

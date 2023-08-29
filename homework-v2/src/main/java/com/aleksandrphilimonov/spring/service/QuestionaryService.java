package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.domain.Question;

import java.util.List;

public interface QuestionaryService {
    void runQuestionary(List<Question> questionList);
}

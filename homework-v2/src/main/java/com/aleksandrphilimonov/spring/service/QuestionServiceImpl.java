package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.dao.QuestionDao;
import com.aleksandrphilimonov.spring.domain.Question;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{
    private final QuestionDao dao;

    @Override
    public List<Question> getQuestionList() {
        return dao.findAllQuestion();
    }
}

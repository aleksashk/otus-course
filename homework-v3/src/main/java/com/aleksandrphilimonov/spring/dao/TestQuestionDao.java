package com.aleksandrphilimonov.spring.dao;

import com.aleksandrphilimonov.spring.domain.TestQuestion;
import org.springframework.core.io.Resource;

import java.util.List;

public interface TestQuestionDao {
    List<TestQuestion> getQuestion(Resource resource);
    String getResource();
}

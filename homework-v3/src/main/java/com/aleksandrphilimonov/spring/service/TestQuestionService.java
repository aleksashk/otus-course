package com.aleksandrphilimonov.spring.service;

import org.springframework.core.io.Resource;

public interface TestQuestionService {
    void conductTesting(Resource resource);
    void setStudent();
}

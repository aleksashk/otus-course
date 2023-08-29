package com.aleksandrphilimonov.spring.dao;

import com.aleksandrphilimonov.spring.domain.Question;
import java.util.List;

public interface QuestionDao {

    /**
     * Возвращает список вопросов для тестирования.
     *
     * @return список вопросов
     */
    List<Question> findAllQuestion();
}

package com.aleksandrphilimonov.spring.dao;

import com.aleksandrphilimonov.spring.domain.TestQuestion;
import com.aleksandrphilimonov.spring.service.ConsoleService;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class TestQuestionDaoImpl implements TestQuestionDao {

    private final String resource;
    private final ConsoleService consoleService;

    @Override
    public List<TestQuestion> getQuestion(Resource resource) {
        List<TestQuestion> questions = new ArrayList<>();
        try {
            InputStreamReader reader = new InputStreamReader(resource.getInputStream());
            questions = new CsvToBeanBuilder<TestQuestion>(reader)
                    .withType(TestQuestion.class)
                    .build()
                    .parse();
        } catch (IllegalStateException ise) {
            consoleService.printMessage("Некорректный формат CSV-файла");
            ise.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.shuffle(questions);
        return questions;
    }


    @Override
    public String getResource() {
        return resource;
    }
}

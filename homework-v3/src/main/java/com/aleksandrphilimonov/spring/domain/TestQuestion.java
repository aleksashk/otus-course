package com.aleksandrphilimonov.spring.domain;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class TestQuestion {
    @CsvBindByName
    private String question;

    @CsvBindAndSplitByName(elementType = String.class, collectionType = ArrayList.class, splitOn = "\\|")
    private List<String> answers;

    @CsvBindByName
    private String rightAnswer;
}

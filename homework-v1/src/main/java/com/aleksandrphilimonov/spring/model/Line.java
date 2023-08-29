package com.aleksandrphilimonov.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Line {
    private String question;
    private List<String> answers;
}

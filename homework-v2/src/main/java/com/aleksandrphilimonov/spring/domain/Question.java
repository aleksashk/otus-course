package com.aleksandrphilimonov.spring.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"question", "variant", "answers"})
public class Question {
    private String question;
    private int variant;
    private String answer;
}

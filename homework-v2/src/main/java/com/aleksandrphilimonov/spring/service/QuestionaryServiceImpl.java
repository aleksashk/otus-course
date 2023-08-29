package com.aleksandrphilimonov.spring.service;

import com.aleksandrphilimonov.spring.domain.Question;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuestionaryServiceImpl implements QuestionaryService {
    private int countAnswer = 0;

    @Override
    public void runQuestionary(List<Question> questionList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите Ваши фамилию и имя:");
        String fio = sc.nextLine();
        questionList.stream()
                .forEach(
                        question -> {
                            System.out.println(question.getQuestion());
                            if (question.getVariant() > 0) {
                                Arrays.asList(question.getAnswer().split(","))
                                        .forEach(System.out::println);
                                while (!sc.hasNext("[0-"+question.getVariant()+"]+")) {
                                    System.out.println("Вы выбрали неверный вариант ответа. Попробуйте ещё раз: ");
                                    sc.next();
                                }
                                Integer variant = sc.nextInt();
                                if (variant > 0) {
                                    System.out.println("Ваш ответ: " + variant);
                                    incCountAnswer();
                                }
                            }
                            String answer = sc.nextLine();
                            if (answer != null && answer.length() > 0) {
                                System.out.println("Ваш ответ: " + answer);
                                incCountAnswer();
                            }
                        }
                );
        System.out.printf("%s, Вы успешно прошли тест. \n" +
                "Вы ответили на %s вопросов из %s%n", fio, countAnswer, questionList.size());
        sc.close();
    }

    private void incCountAnswer() {
        countAnswer ++;
    }
}


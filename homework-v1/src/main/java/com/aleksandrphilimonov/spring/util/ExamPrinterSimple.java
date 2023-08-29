package com.aleksandrphilimonov.spring.util;

import com.aleksandrphilimonov.spring.model.Exam;

public class ExamPrinterSimple implements ExamPrinter{
    @Override
    public void print(Exam exam) {
        exam.getLines().forEach(line -> {
            System.out.println(line.getQuestion());

            line.getAnswers().forEach(System.out::println);
            pressAnyKeyToContinue();
        });
    }

    private void pressAnyKeyToContinue() {
        System.out.println("Press ENTER key to continue");
        try{
            System.in.read();
        }catch (Exception ignored){

        }
    }
}

package com.aleksandrphilimonov.spring.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.PrintStream;
import java.util.Scanner;

@Data
@RequiredArgsConstructor
public class ConsoleServiceImpl implements ConsoleService {

    private final Scanner input;
    private final PrintStream output;

    public ConsoleServiceImpl() {
        this.output = System.out;
        this.input = new Scanner(System.in);
    }

    @Override
    public String getStringWithMessage(String message) {
        output.println(message);
        return input.nextLine();
    }

    @Override
    public int getInt() {
        int givenAnswer;
        while (true) {
            try {
                givenAnswer = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Waiting for a number");
            }
        }
        return givenAnswer;
    }

    @Override
    public void printMessage(String message) {
        output.println(message);
    }
}

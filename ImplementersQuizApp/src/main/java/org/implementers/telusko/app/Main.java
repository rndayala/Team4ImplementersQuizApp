package org.implementers.telusko.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************************");
        System.out.println("\t\tWelcome to Implementers Quiz App!!");
        System.out.println("********************************************************\n");

        QuizService quizService = new QuizService();
        quizService.play();
    }
}
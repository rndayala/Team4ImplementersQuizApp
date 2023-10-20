package org.implementers.telusko.app;

import java.util.Scanner;

public class QuizService {

    QuizRepository quizRepository;
    Quiz quiz;
    int score;

    QuizService(String level) {
        quizRepository = new QuizRepository(level);
        quizRepository.loadQuiz(level);
        score = 0;
    }

    public QuizService() {
        this("Easy");
    }

    public void play() {
        quiz = quizRepository.getQuiz();
        for (Question question: quiz.getQuestions()) {
            showQuestion(question);
            String answer = waitForAnswer();
            int status = verifyAnswer(question, answer);
            calculatePoints(status);
        }
        showResult();
    }

    private void showResult() {
        System.out.println("Thank you for playing the Quiz.");
        System.out.println("You have completed the quiz!!. Your score : " + score);
    }

    private void calculatePoints(int ansStatus) {
        if(ansStatus == 0) {
            score += 0;
        } else if (ansStatus == 1) {
            score += 2;
        } else if (ansStatus == -1) {
            score += -1;
        }
    }

    private int verifyAnswer(Question question, String answer) {
        if(answer != null && (answer.equals(" ") || answer.isEmpty())) {
            // skip case
            System.out.println("You skipped the question!");
            return 0;
        }
        if (question.getCorrectAnswer().equalsIgnoreCase(answer)) {
            // correct case
            System.out.println("Wohoo!! Correct answer!!");
            return 1;
        } else {
            System.out.println("Uhh, Wrong answer!");
            return -1;
        }
    }


    public void showQuestion(Question question) {
        // System.out.print(question.getqId() + ". ");
        System.out.println(question.getTitle() + "\n");
        int i = 1;
        for(String option : question.getOptions()) {
            System.out.println(i + ". " + option);
            i++;
        }
        System.out.println();
    }

    public String waitForAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.trim().isEmpty()) {
            answer = "";
        }
        return answer;
    }
}

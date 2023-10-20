package org.implementers.telusko.app;

/**
 * This class describe Question object.
 * Each Question has ID, Question title, Question type, Multiple options, Correct answers
 */
public class Question {
    private int qId;
    private String title;
    private String[] options;
    private String correctAnswer;
    private String quizLevel;

    public Question(int id, String title, String[] options, String correctAnswer, String quizLevel) {
        this.qId = id;
        this.title = title;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.quizLevel = quizLevel;
    }
    // default constructor
    public Question() {

    }

    public int getqId() {
        return qId;
    }

    public String getTitle() {
        return title;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuizLevel() {
        return quizLevel;
    }
}

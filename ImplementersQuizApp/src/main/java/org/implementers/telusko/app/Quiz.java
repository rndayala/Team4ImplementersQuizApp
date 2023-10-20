package org.implementers.telusko.app;

public class Quiz {
    private Question[] questions ;
    private String level;

    Quiz(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public Question[] getQuestions() {
        return questions;
    }
}

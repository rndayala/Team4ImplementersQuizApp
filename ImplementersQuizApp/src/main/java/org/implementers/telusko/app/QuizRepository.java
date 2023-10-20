package org.implementers.telusko.app;

public class QuizRepository {
    private Quiz quiz;
    private Question[] questionsRepo;
    private Question[] quizQuestions;

    int quizId;

    QuizRepository(String level) {
        quizQuestions = new Question[5];
        questionsRepo = new Question[25];
        loadQuestions();
        getQuestionsForQuiz(level);

    }

    public void loadQuestions() {
        questionsRepo[0] = new Question(1, "Who invented Java Programming?", new String[]{"Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup"}, "James Gosling", "Easy");
        questionsRepo[1] = new Question(2, "Which component is used to compile, debug and execute the java programs?", new String[] {"JRE", "JIT", "JDK", "JVM"}, "JDK", "Easy" );
        questionsRepo[2] = new Question(3, "What is the extension of compiled java classes?", new String[]{".txt", ".java", ".js", ".class"}, ".class", "Easy");
        questionsRepo[3] = new Question(4, "Size of char data type (in bytes) ? ", new String[]{"2", "4", "6", "8"}, "2", "Easy");
        questionsRepo[4] = new Question(5, "Which of the following is not primitive data type in Java ? ", new String[]{"int", "byte", "char", "String"}, "String", "Easy");
    }

    public void loadQuiz(String level) {
        quiz = new Quiz(level);
        quiz.setQuestions(quizQuestions);
    }

    private void getQuestionsForQuiz(String level) {
        int i = 0;
        for(Question question : questionsRepo) {
            if((question!=null) && (question.getQuizLevel().equalsIgnoreCase(level))) {
                quizQuestions[i] = question;
                i++;
            }
        }
    }

    public Quiz getQuiz() {
        return quiz;
    }
}

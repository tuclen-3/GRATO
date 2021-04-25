package com.example.grato_gv.Model;

public class Quiz {
    private String quizName;
    private String deadline;
    private Integer time;
    private Integer numQuestion;

    // alt + insert : generate constructor, getter & setter
    public Quiz(String quizName, String deadline, Integer time, Integer numQuestion) {
        this.quizName = quizName;
        this.deadline = deadline;
        this.time = time;
        this.numQuestion = numQuestion;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getNumQuestion() {
        return numQuestion;
    }

    public void setNumQuestion(Integer numQuestion) {
        this.numQuestion = numQuestion;
    }
}

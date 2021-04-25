package com.example.grato_sv.Model;

import java.util.SplittableRandom;

public class ListQuiz {
    public String name;
    public String deadline;
    public String complete;
    public String buttonquiz;

    public ListQuiz(String name,String deadline, String complete,String buttonquiz){
        this.name = name;
        this.deadline = deadline;
        this.complete = complete;
        this.buttonquiz = buttonquiz;
    }
    public String getName() {
        return this.name;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public String getComplete() {
        return this.complete;
    }

    public String getButtonQuiz() {
        return this.buttonquiz;
    }
}

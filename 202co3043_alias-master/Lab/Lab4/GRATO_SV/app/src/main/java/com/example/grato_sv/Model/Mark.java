package com.example.grato_sv.Model;

import java.util.SplittableRandom;

public class Mark {
    public String name;
    public String deadline;
    public String complete;
    public String mark;

    public Mark(String name,String deadline, String complete,String mark){
        this.name = name;
        this.deadline = deadline;
        this.complete = complete;
        this.mark = mark;
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

    public String getMark() {
        return this.mark;
    }
}
package com.example.grato_gv.Model;

import java.util.ArrayList;

public class QuizScan {
    private String name;
    private Integer numQuestions;
    private ArrayList<ExamCode> examCodes;

    public QuizScan(String name, Integer numQuestions, ArrayList<ExamCode> examCodes) {
        this.name = name;
        this.numQuestions = numQuestions;
        this.examCodes = examCodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }

    public ArrayList<ExamCode> getExamCodes() {
        return examCodes;
    }

    public void setExamCodes(ArrayList<ExamCode> examCodes) {
        this.examCodes = examCodes;
    }
}

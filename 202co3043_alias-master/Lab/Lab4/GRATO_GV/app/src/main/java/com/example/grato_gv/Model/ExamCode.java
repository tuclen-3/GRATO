package com.example.grato_gv.Model;

public class ExamCode {
    private String id;
    private String answers;

    public ExamCode(String id, String answers) {
        this.id = id;
        this.answers = answers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}

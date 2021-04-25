package com.example.grato_gv.Model;

public class QuizScanReview {
    private Student student;
    private ExamCode examCode;
    private Double score;

    public QuizScanReview(Student student, ExamCode examCode, Double score) {
        this.student = student;
        this.examCode = examCode;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ExamCode getExamCode() {
        return examCode;
    }

    public void setExamCode(ExamCode examCode) {
        this.examCode = examCode;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}

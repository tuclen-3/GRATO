package com.example.grato_gv.Model;

public class InfoClass {
    private String className;
    private Integer maxStudent;
    private Integer nowStudent;

    public InfoClass(String className, Integer maxStudent, Integer nowStudent){
        this.className = className;
        this.maxStudent = maxStudent;
        this.nowStudent = nowStudent;
    }

    public void setClassName(String className){
        this.className = className;
    }
    public String getClassName(){
        return this.className;
    }

    public void setMaxStudent(Integer maxStudent){
        this.maxStudent = maxStudent;
    }
    public Integer getMaxStudent(){
        return this.maxStudent;
    }

    public void setNowStudent(Integer nowStudent){
        this.nowStudent = nowStudent;
    }
    public Integer getNowStudent(){
        return this.nowStudent;
    }

}

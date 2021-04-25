package com.example.grato_sv.Model;

public class Group {
    private String nameGroup;
    private Integer maxMember;
    private Integer wholesale;

    public Group(String nameGroup, Integer maxMember, Integer wholesale){
        this.nameGroup = nameGroup;
        this.maxMember = maxMember;
        this.wholesale = wholesale;
    }

    public String getNameGroup(){
        return nameGroup;
    }

    public void setNameGroup(String nameGroup){
        this.nameGroup = nameGroup;
    }

    public Integer getMaxMember(){
        return maxMember;
    }

    public void setMaxMember(Integer maxMember){
        this.maxMember = maxMember;
    }

    public Integer getWholesale(){
        return wholesale;
    }

    public void setWholesale(Integer wholesale){
        this.wholesale = wholesale;
    }
}

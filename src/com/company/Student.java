package com.company;

public class Student {
    private String name;
    private int studyingStartYear;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getStudyingStartYear() {
        return this.studyingStartYear;
    }

    public void setStudyingStartYear(int studyingStartYear) {
        this.studyingStartYear = studyingStartYear;
    }

    public void printInfo() {
        System.out.println(this.name + " начал учиться в " + this.studyingStartYear + " году.");
    }
}

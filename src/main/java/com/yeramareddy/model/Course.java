package com.yeramareddy.model;

public class Course {

    private String subCode;
    private String subName;
    private int noOfTheoryLecturesPerWeek;
    private int noOfPracticalLecturesPerWeek;

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getNoOfTheoryLecturesPerWeek() {
        return noOfTheoryLecturesPerWeek;
    }

    public void setNoOfTheoryLecturesPerWeek(int noOfTheoryLecturesPerWeek) {
        this.noOfTheoryLecturesPerWeek = noOfTheoryLecturesPerWeek;
    }

    public int getNoOfPracticalLecturesPerWeek() {
        return noOfPracticalLecturesPerWeek;
    }

    public void setNoOfPracticalLecturesPerWeek(int noOfPracticalLecturesPerWeek) {
        this.noOfPracticalLecturesPerWeek = noOfPracticalLecturesPerWeek;
    }



    @Override
    public String toString() {
        return "Course{" +
                "subCode='" + subCode + '\'' +
                ", subName='" + subName + '\'' +
                ", noOfTheoryLecturesPerWeek='" + noOfTheoryLecturesPerWeek + '\'' +
                ", noOfPracticalLecturesPerWeek='" + noOfPracticalLecturesPerWeek + '\'' +
                '}';
    }
}

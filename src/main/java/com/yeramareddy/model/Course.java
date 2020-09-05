package com.yeramareddy.model;

public class Course {

    private String subCode;
    private String subName;
    private String noOfTheoryLecturesPerWeek;
    private String noOfPracticalLecturesPerWeek;

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

    public String getNoOfTheoryLecturesPerWeek() {
        return noOfTheoryLecturesPerWeek;
    }

    public void setNoOfTheoryLecturesPerWeek(String noOfTheoryLecturesPerWeek) {
        this.noOfTheoryLecturesPerWeek = noOfTheoryLecturesPerWeek;
    }

    public String getNoOfPracticalLecturesPerWeek() {
        return noOfPracticalLecturesPerWeek;
    }

    public void setNoOfPracticalLecturesPerWeek(String noOfPracticalLecturesPerWeek) {
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

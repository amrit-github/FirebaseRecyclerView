package com.example.amrit.practice;

public class Model {

    private String english,hindi,maths;

    public Model() {
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public Model(String english, String hindi, String maths) {
        this.english = english;
        this.hindi = hindi;
        this.maths = maths;
    }
}

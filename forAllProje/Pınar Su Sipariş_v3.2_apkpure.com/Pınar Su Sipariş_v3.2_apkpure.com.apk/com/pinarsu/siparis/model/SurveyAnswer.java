package com.pinarsu.siparis.model;

public class SurveyAnswer {
    public String answer;
    public boolean isChecked;

    public SurveyAnswer(String str, boolean z) {
        this.answer = str;
        this.isChecked = z;
    }
}

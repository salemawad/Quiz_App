package com.salem.myapp.modle;

import java.util.ArrayList;

public class Qustion {

    private String name;
    private String correct_answer;
    ArrayList<String> answer_list;

    public Qustion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public ArrayList<String> getAnswer_list() {
        return answer_list;
    }

    public void setAnswer_list(ArrayList<String> answer_list) {
        this.answer_list = answer_list;
    }
}

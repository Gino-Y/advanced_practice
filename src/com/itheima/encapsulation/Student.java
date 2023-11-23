package com.itheima.encapsulation;

public class Student {
    private double score;

    public void setScore(double score){
        if(score < 0 || score > 100){
            System.out.println("成绩不合法");
            return;
        }
        this.score = score;
    }

    public double getScore(){
        return score;
    }

    public void printPass(){
        System.out.println((score >= 60 ? "成绩合格" : "成绩不合格"));
    }
}

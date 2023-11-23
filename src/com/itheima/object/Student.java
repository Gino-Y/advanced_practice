package com.itheima.object;

public class Student {
    String name;
    double chinese;
    double math;

    public void printTotalScore() {

        System.out.println(this.name + "的总分是" + (this.chinese + this.math));
    }

    public void printAverageScore() {
        System.out.println(this.name + "的平均分是" + ((this.chinese + this.math) / 2.0));
    }
}

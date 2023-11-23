package com.itheima.constructor;

public class Student {
    String name;
    double score;
    public Student() {
        System.out.println("无参构造方法执行了");
    }

    public Student(String name, double score) {
        System.out.println("有参构造方法执行了");
        this.name = name;
        this.score = score;
    }

    public void printThis() {
        System.out.println(this);
    }


}

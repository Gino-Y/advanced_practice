package com.itheima.d7_interface_demo;

/**
 * 学生类
 */
public class Student {
    private String name; // 姓名
    private char sex; // 性别
    private double score; // 分数

    /**
     * 无参构造方法
     */
    public Student() {
    }

    /**
     * 带参构造方法
     * @param name 姓名
     * @param sex 性别
     * @param score 分数
     */
    public Student(String name, char sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    /**
     * 获取姓名
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     * @return 性别
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置性别
     * @param sex 性别
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 获取分数
     * @return 分数
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置分数
     * @param score 分数
     */
    public void setScore(double score) {
        this.score = score;
    }
}

package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * 实现了StudentOperator接口的类，用于操作学生信息。
 */
public class StudentOperatorImpl1 implements StudentOperator{
    /**
     * 打印学生信息。
     * @param students 学生列表
     */
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("----全班全部学生信息如下----------------------");
        for (Student s : students) {
            System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getScore());
        }
        System.out.println("------------------------------------------");
    }

    /**
     * 打印学生平均分。
     * @param students 学生列表
     */
    @Override
    public void printAvgScore(ArrayList<Student> students) {
        System.out.println("----全班学生平均分如下----------------------");
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        System.out.println("全班学生平均分为：" + sum / students.size());
        System.out.println("------------------------------------------");
    }
}

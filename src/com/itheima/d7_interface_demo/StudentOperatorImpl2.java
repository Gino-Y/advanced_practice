package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * 实现学生操作接口的具体类。
 */
public class StudentOperatorImpl2 implements StudentOperator {

    /**
     * 打印学生信息。
     * @param students 学生列表
     */
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("----全班全部学生信息如下----------------------");
        int count1 = 0;
        int count2 = 0;

        for (Student s : students) {
            System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getScore());
            if (s.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("男生人数：" + count1);
        System.out.println("女生人数：" + count2);
        System.out.println(("班级人数：" + students.size()));
        System.out.println("------------------------------------------");
    }

    /**
     * 打印学生平均分。
     * @param students 学生列表
     */
    @Override
    public void printAvgScore(ArrayList<Student> students) {
        System.out.println("----全班学生平均分如下----------------------");
        //去掉最高分和最低分后，再计算全班学生平均分
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        double sum = 0;
        for (Student s : students) {
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
            sum += s.getScore();
        }
        System.out.println("全班学生平均分为：" + (sum - max - min) / (students.size() - 2));
        System.out.println("------------------------------------------");
    }
}

package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        // 创建一个学生对象，封装数据
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.chinese = 90;
        stu1.math = 80;

        // 调用方法，打印总分
        stu1.printTotalScore();

        // 调用方法，打印平均分
        stu1.printAverageScore();

        // 创建一个学生对象，封装数据
        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.chinese = 80;
        stu2.math = 70;

        // 调用方法，打印总分
        stu2.printTotalScore();

        // 调用方法，打印平均分
        stu2.printAverageScore();
    }
}

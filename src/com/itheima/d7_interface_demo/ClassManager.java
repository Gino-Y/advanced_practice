package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * ClassManager类用于管理班级学生信息。
 */
public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentsOperator = new StudentOperatorImpl2();

    /**
     * 构造函数，初始化班级学生信息。
     */
    public ClassManager() {
        students.add(new Student("张三", '男', 99.5));
        students.add(new Student("李四", '男', 98.5));
        students.add(new Student("王五", '女', 97.5));
        students.add(new Student("赵六", '男', 96.5));
        students.add(new Student("田七", '女', 95.5));
    }

    /**
     * 打印全班学生信息。
     */
    public void printInfo(){
        studentsOperator.printInfo(students);
    }

    /**
     * 打印全班学生平均分。
     */
    public void printAvgScore(){
        studentsOperator.printAvgScore(students);
    }
}

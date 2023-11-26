package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * 学生操作接口
 */
public interface StudentOperator {
    /**
     * 打印学生信息
     * @param students 学生列表
     */
    void printInfo(ArrayList<Student> students);

    /**
     * 打印学生平均分
     * @param students 学生列表
     */
    void printAvgScore(ArrayList<Student> students);
}

package com.itheima.javabean;

/**
 * StudentOperator类表示一个学生对象的操作者。
 * 它提供了对学生对象执行操作的方法，例如打印及格状态。
 */
public class StudentOperator {
    private final Student student;

    /**
     * 使用指定的学生构造一个StudentOperator对象。
     * 
     * @param student 要操作的学生对象
     */
    public StudentOperator(Student student) {
        this.student = student;
    }

    /**
     * 打印学生的及格状态。
     * 如果学生的分数大于等于60，打印学生及格；否则，打印学生没有及格。
     */
    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName() + "及格了");
        }else{
            System.out.println(student.getName() + "没有及格");
        }
    }
}

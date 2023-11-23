package com.itheima.javabean;

public class StudentOperator {
    private final Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName() + "及格了");
        }else{
            System.out.println(student.getName() + "没有及格");
        }
    }
}

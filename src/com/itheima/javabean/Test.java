package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setScore(80);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();

        System.out.println("----------------------");

        Student s2 = new Student("李四", 90);
        System.out.println(s2.getName());
        System.out.println(s2.getScore());

        StudentOperator operator2 = new StudentOperator(s2);
        operator2.printPass();
    }
}

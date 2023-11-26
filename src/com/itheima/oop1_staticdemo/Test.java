package com.itheima.oop1_staticdemo;

public class Test {
    public static void main(String[] args) {
        //类变量的使用方式：类名.类变量名
        Student.name = "张三";
        Student.name = "李四";

        System.out.println(Student.name);

        //实例变量的使用方式：引用.实例变量名
        Student s1 = new Student();
        Student s2 = new Student();
        s1.age = 18;
        s2.age = 20;

        System.out.println(s1.age);
        System.out.println(s2.age);

        //类变量和实例变量的区别
        //类变量：所有对象共享一份数据
        //类变量：随着类的加载而加载，随着类的消失而消失，存储在方法区中
        //实例变量：每个对象一份数据
        //实例变量：随着对象的创建而存在，随着对象的消失而消失，存储在堆内存中
    }
}

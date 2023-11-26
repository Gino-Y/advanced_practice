package com.itheima.oop1_staticdemo;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        System.out.println(User.count); // 2

        User u3 = new User("张三");
        User u4 = new User("李四");
        System.out.println(User.count); // 2

        System.out.println(u1.name); // null
        System.out.println(u2.name); // null
        System.out.println(u3.name); // 张三
        System.out.println(u4.name); // 李四

        System.out.println(u1.count); // 2
        System.out.println(u2.count); // 2
        System.out.println(u3.count); // 2
        System.out.println(u4.count); // 2

        System.out.println(User.count); // 2
    }
}

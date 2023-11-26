package com.itheima.oop1_staticdemo;

public class User {
    public static int count = 0;
    public User() {
        count++;
    }

    public String name;
    public User(String name) {
        this.name = name;
    }
}

package com.itheima.d3_inner_class3;

public class Test2 {
    public static void main(String[] args) {
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗游泳飞快~~~");
//            }
//        };
//        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游泳飞快~~~");
            }
        });
    }

    // 设计一个方法，可以接收任意的实现了Swimming接口的类的对象，并调用swim()方法。
    public static void go(Swimming s) {
        System.out.println("-----------------");
        s.swim();
    }
}



interface Swimming {
    void swim();
}
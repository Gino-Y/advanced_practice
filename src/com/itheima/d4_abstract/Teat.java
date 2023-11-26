package com.itheima.d4_abstract;

public class Teat {
    public static void main(String[] args) {
        // 认识抽象类和其特点。
        // 抽象类不能实例化对象，只能用来被继承。
        // 抽象类中可以定义普通方法，普通方法可以定义在抽象类中，也可以定义在子类中。
        Animal a = new Cat();
        a.setName("加菲猫");
        System.out.println(a.getName());
        a.cry();
    }
}

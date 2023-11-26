package com.itheima.d6_enum;

public enum A {
    // 第一行必须是枚举值列表
    X, Y, Z;
    // 枚举值列表后面可以有属性、方法、构造器
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

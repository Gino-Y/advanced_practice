package com.itheima.d7_enum2;

import java.time.ZoneId;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握枚举的应用场景：做信息标准和分类
//        check(1);
//        check(Constant.BOY);
        check(Constant2.BOY);
        Runtime t = Runtime.getRuntime();
        System.out.println(t.availableProcessors());

        //输出当前时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
    }

    public static void check(Constant2 sex) {
        switch (sex) {
            case BOY:
                System.out.println("展示一些美女，游戏信息");
                break;
            case GIRL:
                System.out.println("展示一些帅哥，土豪信息");
                break;
        }
    }

//    public static void check(int sex) {
//        switch (sex) {
//            case Constant.BOY:
//                System.out.println("展示一些美女，游戏信息");
//                break;
//            case Constant.GIRL:
//                System.out.println("展示一些帅哥，土豪信息");
//                break;
//        }
//    }

}

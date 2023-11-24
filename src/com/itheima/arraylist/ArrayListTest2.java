package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list); // [Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子]

//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if (ele.contains("枸杞")) {
//                list.remove(ele);
//                i--;
//            }
//        }
//        System.out.println(list); // [Java入门, 人字拖]


        for (int i = list.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            if (ele.contains("枸杞")) {
                list.remove(ele);
            }
        }
        System.out.println(list); // [Java入门, 人字拖]
    }
}

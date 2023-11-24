package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("黑马");
        list.add("666");
        list.add("99.5");
        list.add("黑马");
        list.add("Java");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("黑马");
        list2.add("666");
        list2.add("99.5");
        list2.add("黑马");
        list2.add("Java");
        System.out.println(list2);

        list2.add(1, "-----TestText-----");
        System.out.println(list2);

        System.out.println(list2.get(1));

        System.out.println(list2.size());

        System.out.println(list2.remove(1));
        System.out.println(list2);

        System.out.println(list2.remove("黑马"));
        System.out.println(list2);

        System.out.println(list2.set(1, "-----这里被替换了-----"));
        System.out.println(list2);
    }
}

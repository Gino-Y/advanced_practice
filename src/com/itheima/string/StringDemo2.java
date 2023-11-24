package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "黑马Java";
        System.out.println(s.length());

        System.out.println(s.charAt(1));

        System.out.println("-------------------------");
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println("-------------------------");
        // 转换为字符数组，遍历字符数组
        char[] c = s.toCharArray();
        for(char ci : c){
            System.out.println(ci);
        }

        System.out.println("----字符串是否相同---------------------");
        // 判断字符串是否相同，相同返回true，否则返回false
        String s1 = new String("黑马Java");
        String s2 = new String("黑马Java");
        System.out.println((s1 == s2));

        System.out.println("----内容是否相---------------------");
        // 判断内容是否相同，相同返回true，否则返回false
        System.out.println(s1.equals(s2));

        System.out.println("----忽略大小写判断内容是否相同---------------------");
        // 忽略大小写判断内容是否相同，相同返回true，否则返回false
        String s3 = new String("34AeFG");
        String s4 = new String("34aEfg");
        System.out.println(s3.equalsIgnoreCase(s4));

        System.out.println("----截取字符串内容---------------------");
        // 截取字符串内容（包含头不包含尾）
        String s5 = "Java是最好的编程语言之一";
        String rs = s5.substring(0, 8);
        System.out.println(rs);

        System.out.println("----当前位置截取到结尾---------------------");
        // 从当前位置截取到结尾
        String rs2 = s5.substring(8);
        System.out.println(rs2);

        System.out.println("----替换指定索引的内容---------------------");
        // 替换指定索引的内容
        String info = "这部电影简直是个垃圾，垃圾中的战斗机";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        System.out.println("----判断字符串中是否包含某个关键字---------------------");
        // 判断字符串中是否包含某个关键字
        String rs4 = "Java是最好的编程语言之一，我爱Java，Java不爱我";
        System.out.println(rs4.contains("Java"));

        System.out.println("----判断字符串是否以某个关键字开头---------------------");
        // 判断字符串是否以某个关键字开头
        System.out.println(rs4.startsWith("Java"));

        System.out.println("----分割字符串并放到数组中---------------------");
        // 分割字符串并放到数组中
        String rs5 = "Java,PHP,C++,C#";
        String[] arr = rs5.split(",");
        for (String a : arr) {
            System.out.println(a);
        }
    }
}

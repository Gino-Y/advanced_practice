package com.itheima.demo;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie(1, "肖申克的救赎", "弗兰克·德拉邦特", "蒂姆·罗宾斯", "摩根·弗里曼", "剧情", 1994, "美国", "英语", "希望让人自由。"),
            new Movie(2, "这个杀手不太冷", "吕克·贝松", "让·雷诺", "娜塔莉·波特曼", "剧情", 1994, "法国", "英语", "怪蜀黍和小萝莉不得不说的故事。"),
            new Movie(3, "霸王别姬", "陈凯歌", "张国荣", "张丰毅", "剧情", 1993, "中国大陆", "汉语普通话", "风华绝代。"),
            new Movie(4, "阿甘正传", "罗伯特·泽米吉斯", "汤姆·汉克斯", "罗宾·怀特", "剧情", 1994, "美国", "英语", "一部美国近现代史。"),
            new Movie(5, "美丽人生", "罗伯托·贝尼尼", "罗伯托·贝尼尼", "尼可莱塔·布拉斯基", "剧情", 1997, "意大利", "意大利语", "最美的谎言。"),
            new Movie(6, "泰坦尼克号", "詹姆斯·卡梅隆", "莱昂纳多·迪卡普里奥", "凯特·温丝莱特", "剧情", 1997, "美国", "英语", "失去的才是永恒的。"),
        };
        MovieOpreator movieOpreator = new MovieOpreator(movies);
//        movieOpreator.printAllMovies();
//        movieOpreator.searchMovieById(1);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择查询方式：");
            System.out.println("1. 查询所有电影信息");
            System.out.println("2. 查询单部电影信息");
            int option = 0;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的选项无效");
                return;
            }

            switch (option) {
                case 1:
                    movieOpreator.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入要查询的电影ID：");
                    int movieId = 0;
                    try {
                        movieId = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("输入的电影ID无效");
                    }
                    movieOpreator.searchMovieById(movieId);
                    break;
                default:
                    System.out.println("无效的选项, 请重新输入");
            }
        }
    }
}

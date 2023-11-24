package com.itheima.demo;

import java.util.Optional;

/**
 * MovieOpreator类用于操作电影信息。
 */
public class MovieOpreator {
    private final Movie[] movies;

    /**
     * 构造方法，用于初始化MovieOpreator对象。
     * @param movies 电影数组
     */
    public MovieOpreator(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 打印所有电影的信息。
     */
    public void printAllMovies() {
        System.out.println("-------------电影全部信息如下--------------");
        for (Movie m : movies) {
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("导演：" + m.getDirector());
        }
        System.out.println("---------------------------");
    }

    /**
     * 根据电影编号搜索电影信息。
     * @param id 电影编号
     */
    public void searchMovieById(int id) {
        for (Movie movie: movies) {
            if (movie.getId() == id) {
                System.out.println("-------------电影详细信息如下--------------");
                System.out.println("编号：" + movie.getId());
                System.out.println("名称：" + movie.getName());
                System.out.println("导演：" + movie.getDirector());
                System.out.println("主演：" + movie.getActor());
                System.out.println("女主演：" + movie.getActress());
                System.out.println("类型：" + movie.getGenre());
                System.out.println("年份：" + movie.getYear());
                System.out.println("国家：" + movie.getCountry());
                System.out.println("语言：" + movie.getLanguage());
                System.out.println("简介：" + movie.getDescription());
                System.out.println("---------------------------");
                return;
            }

        }
        System.out.println("没有找到编号为" + id + "的电影");
    }
}

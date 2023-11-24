package com.itheima.demo;

public class Movie {
    private int id;
    private String name;
    private String director;
    private String actor;
    private String actress;
    private String genre;
    private int year;
    private String country;
    private String language;
    private String description;

    public Movie() {
    }

    public Movie(int id, String name, String director, String actor, String actress, String genre, int year, String country, String language, String description) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
        this.year = year;
        this.country = country;
        this.language = language;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

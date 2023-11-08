package org.lessons.bestoftheyear.model;

public class Movie {

    // ATTRIBUTI
    private int id;
    private String title;

    // COSTRUTTORI
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // GETTER E SETTER
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

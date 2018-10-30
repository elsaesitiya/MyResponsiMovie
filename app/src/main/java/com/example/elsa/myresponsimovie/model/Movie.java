package com.example.elsa.myresponsimovie.model;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private String description;
    private String date;
    private String url;
    private double rating;

    public Movie(String title, String description, String date, String url, double rating) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.url = url;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

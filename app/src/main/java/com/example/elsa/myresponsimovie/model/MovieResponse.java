package com.example.elsa.myresponsimovie.model;

import java.util.List;

public class MovieResponse {
    private List<Movie> result;

    public MovieResponse(List<Movie> result) {
        this.result = result;
    }

    public List<Movie> getResult() {
        return result;
    }

    public void setResult(List<Movie> result) {
        this.result = result;
    }
}

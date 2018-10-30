package com.example.elsa.myresponsimovie.api;

import com.example.elsa.myresponsimovie.model.Movie;
import com.example.elsa.myresponsimovie.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRetrofit {
    @GET("now_playing?api_key=7767e27133e7f3ae8ebaa22508a82e99")
    Call<List<Movie>> getMoviesT();

    @GET("now_playing?api_key=7767e27133e7f3ae8ebaa22508a82e99")
    Call<MovieResponse> getMovies();
}

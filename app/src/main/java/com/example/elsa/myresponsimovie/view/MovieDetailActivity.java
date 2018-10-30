package com.example.elsa.myresponsimovie.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.elsa.myresponsimovie.R;
import com.example.elsa.myresponsimovie.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {
    private Movie movie;
    private ImageView imgMovie;
    private TextView tvTitle, tvDate, tvDiscription;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movie = (Movie) getIntent().getSerializableExtra(movie);
        initUI();

    }

    private void initUI() {
        imgMovie = findViewById(R.id.imgMovieD);


    }
}

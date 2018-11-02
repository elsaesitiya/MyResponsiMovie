package com.example.elsa.myresponsimovie.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.elsa.myresponsimovie.R;
import com.example.elsa.myresponsimovie.api.API;
import com.example.elsa.myresponsimovie.model.Movie;
import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {
    private Movie movie;
    private ImageView imgMovie;
    private TextView tvTitle, tvDate, tvDescription;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movie = (Movie) getIntent().getSerializableExtra("movie");
        initUI();

    }

    private void initUI() {
        imgMovie = findViewById(R.id.imgMovieD);
        Picasso.get().load(API.POSTER + movie.getUrl()).centerCrop().fit().into(imgMovie);

        tvTitle = findViewById(R.id.tvTitleD);
        tvTitle.setText(movie.getTitle());

        tvDate = findViewById(R.id.tvDateD);
        tvDate.setText("Tayang anggal :" + " " + movie.getDate());

        tvDescription = findViewById(R.id.tvDescription);
        tvDescription.setText(movie.getDescription());

        ratingBar = findViewById(R.id.rbMovieD);
        ratingBar.setRating((float)(movie.getRating()/2));


    }
}

package com.dicoding.submission1.cineplex21.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import com.dicoding.submission1.cineplex21.R
import com.dicoding.submission1.cineplex21.`object`.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var movie:Movie = intent.getParcelableExtra<Movie>("movie_object")

        movie_image.setImageResource(movie.image)
        movie_name.setText(movie.name)
        movie_year_published.setText(movie.yearPublished.toString())
        movie_duration.setText(movie.duration.toString() + " minutes")
        movie_rating.rating = movie.rating
        movie_synopsis.setText(movie.synopsis)

        movie_rating.setOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            ratingBar.rating = movie.rating
        })
    }
}

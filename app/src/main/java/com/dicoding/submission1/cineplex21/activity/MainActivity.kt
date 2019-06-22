package com.dicoding.submission1.cineplex21.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.submission1.cineplex21.R
import com.dicoding.submission1.cineplex21.adapter.MovieAdapter
import com.dicoding.submission1.cineplex21.repository.MovieRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var movieRepository: MovieRepository = MovieRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv_movies.adapter = MovieAdapter(movieRepository.getAlMovies(), this)
    }
}

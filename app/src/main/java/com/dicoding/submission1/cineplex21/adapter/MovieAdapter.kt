package com.dicoding.submission1.cineplex21.adapter

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RatingBar
import com.dicoding.submission1.cineplex21.R
import com.dicoding.submission1.cineplex21.`object`.Movie
import com.dicoding.submission1.cineplex21.activity.DetailActivity
import kotlinx.android.synthetic.main.lv_movie_item.view.*

class MovieAdapter (val alMovies: ArrayList<Movie>, val context: Context) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.lv_movie_item, parent, false)

        var movie = alMovies.get(position)
        var movieViewHolder = MovieViewHolder(view, movie)

        movieViewHolder.view.setOnClickListener(View.OnClickListener {
            var intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("movie_object", movie)
            context.startActivity(intent)
        })

        movieViewHolder.view.movie_rating.setOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            ratingBar.rating = movie.rating
        })
        view.tag = movieViewHolder

        return view;
    }

    override fun getItem(position: Int): Any {
        return alMovies.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return alMovies.size
    }
}

class MovieViewHolder(val view: View, val movie: Movie){
    init {
        view.movie_image.setImageResource(movie.image)
        view.movie_name.setText(movie.name)
        view.movie_rating.rating = movie.rating
    }
}

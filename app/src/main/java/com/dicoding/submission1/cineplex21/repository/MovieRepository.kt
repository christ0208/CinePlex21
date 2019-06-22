package com.dicoding.submission1.cineplex21.repository

import com.dicoding.submission1.cineplex21.R
import com.dicoding.submission1.cineplex21.`object`.Movie

class MovieRepository {
    private var alMovies: ArrayList<Movie> = ArrayList()

    constructor(){
        this.alMovies = ArrayList()
        this.generateMovies()
    }

    fun generateMovies(){
        alMovies.add(Movie(1, R.drawable.poster_aquaman, "Aquaman", 3.4f, 2018, 144, "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."))
        alMovies.add(Movie(2, R.drawable.poster_avengerinfinity, "Avengers: Infinity War", 4.15f, 2018, 149, "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."))
        alMovies.add(Movie(3, R.drawable.poster_bumblebee, "Bumblebee", 3.25f, 2018, 114, "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug."))
        alMovies.add(Movie(4, R.drawable.poster_deadpool, "Once Upon a Deadpool", 3.5f, 2018, 117, "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's."))
        alMovies.add(Movie(5, R.drawable.poster_dragon, "How to Train Your Dragon: The Hidden World", 3.85f, 2019, 104, "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."))
        alMovies.add(Movie(6, R.drawable.poster_dragonball, "Dragon Ball Super: Broly", 3.7f, 2018, 101, "Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called 'Broly' who they've never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so what's this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza (back from Hell) getting caught up in the mix."))
        alMovies.add(Movie(7, R.drawable.poster_glass, "Glass", 3.25f, 2019, 129, "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."))
        alMovies.add(Movie(8, R.drawable.poster_robinhood, "Robin Hood", 2.9f, 2018, 116, "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."))
        alMovies.add(Movie(9, R.drawable.poster_spiderman, "Spider-Man: Into the Spider-Verse", 4.2f, 2018, 117, "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."))
        alMovies.add(Movie(10, R.drawable.poster_venom, "Venom", 3.3f, 2018, 112, "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."))
    }

    fun getAlMovies(): ArrayList<Movie>{
        return this.alMovies
    }
}
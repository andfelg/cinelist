package com.example.cinelist.data.remote


data class MoviesByNameResponse(
    val Search: List<Movie>?,
    val totalResults: String?,
    val Response: String,
    val Error: String?
)

data class Movie(
    val Title: String,
    val Year: String,
    val imdbID: String,
    val Type: String,
    val Poster: String,
    val Response: String
)
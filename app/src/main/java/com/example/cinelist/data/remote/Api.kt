package com.example.cinelist.data.remote

import com.example.cinelist.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

data class MovieResponseTest(
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

interface Api {

    // tt15239678

    @GET("/")
    suspend fun searchMovieByImdb(
        @Query("apikey") apiKey: String,
        @Query("i") query: String,
        @Query("type") type: String = "movie"
    ): Movie

}
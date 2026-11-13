package com.example.cinelist.data.remote

import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    // tt15239678

    @GET("/")
    suspend fun searchMovieByImdb(
        @Query("apikey") apiKey: String,
        @Query("i") query: String,
        @Query("type") type: String = "movie"
    ): Movie

}
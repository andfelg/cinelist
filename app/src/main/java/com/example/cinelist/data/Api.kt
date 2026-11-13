package com.example.cinelist.data

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.cinelist.BuildConfig


public class Api {
    val apikey = BuildConfig.OMDB_API_KEY

    @Composable
    fun GetMovie(){
        Text(text = "hola ${BuildConfig.OMDB_API_KEY}")
    }
}
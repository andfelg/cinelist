package com.example.cinelist.components

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cinelist.BuildConfig
import com.example.cinelist.data.remote.RetrofitInstance
import kotlinx.coroutines.launch

@Composable
fun MovieTestScreen() {

    var movies by remember { mutableStateOf(emptyList<String>()) }
    var singlemovie by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Presiona el botón para buscar películas") }
    var loading by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Button(
            onClick = {
                scope.launch {
                    loading = true
                    message = ""

                    try {
                        val response = RetrofitInstance.api.searchMovieByImdb(
                            apiKey = BuildConfig.OMDB_API_KEY,
                            query = "tt15239678"
                        )

                        Log.d("a","MovieTestScreen: ${response}")

                        if (response.Response == "True") {
                            singlemovie = response.Title

                            message = "Películas encontradas:"
                        } else {
                            movies = emptyList()
                            message = "No se encontraron películas"
                        }

                    } catch (e: Exception) {
                        message = "Error: ${e.localizedMessage}"
                    }

                    loading = false
                }
            },
            enabled = !loading
        ) {
            Text("Buscar películas")
        }

        if (loading) {
            CircularProgressIndicator()
        }

        Text(text = message)

        Text(text = singlemovie)
    }
}
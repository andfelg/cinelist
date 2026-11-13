package com.example.cinelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinelist.components.MovieTestScreen
import com.example.cinelist.data.remote.RetrofitInstance
import com.example.cinelist.ui.theme.CinelistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CinelistTheme {

                MovieTestScreen()

            }
        }
    }
}

@Composable
fun Greeting() {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}
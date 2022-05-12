package com.example.multiplescreensupportdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.comptest.rememberWindowSize
import com.example.multiplescreensupportdemo.navigation.SetupNavGraph
import com.example.multiplescreensupportdemo.ui.theme.MultipleScreenSupportDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleScreenSupportDemoTheme {
                val window = rememberWindowSize()
                val navController = rememberNavController()
                SetupNavGraph(windowSize = window, navController = navController)
            }
        }
    }
}
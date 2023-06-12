package com.coooldoggy.leftover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.coooldoggy.leftover.presentation.LeftOverApp
import com.coooldoggy.leftover.ui.theme.LeftOverTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeftOverTheme {
                LeftOverApp()
            }
        }
    }
}
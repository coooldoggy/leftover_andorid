package com.coooldoggy.leftover.ui.route

import android.annotation.SuppressLint
import androidx.annotation.IdRes
import com.coooldoggy.leftover.R

sealed class ScreenRoute(@IdRes val title: Int, val screenRoute: String) {
    @SuppressLint("ResourceType")
    object SplashScreen : ScreenRoute(title = R.string.route_splash, screenRoute = SPLASH_VIEW)
    @SuppressLint("ResourceType")
    object MainScreen : ScreenRoute(title = R.string.route_main, screenRoute = MAIN_VIEW)
}

const val SPLASH_VIEW = "SPLASH_VIEW"
const val MAIN_VIEW = "MAIN_VIEW"

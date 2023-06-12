package com.coooldoggy.leftover.presentation

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.coooldoggy.leftover.R
import com.coooldoggy.leftover.ui.base.NotoSansText
import com.coooldoggy.leftover.ui.route.ScreenRoute
import com.coooldoggy.leftover.ui.theme.TextPurple

@Composable
fun SplashScreen(navController: NavHostController) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_hand),
            contentDescription = "counting hand",
        )
        NotoSansText(
            text = "남은거",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = TextPurple,
            modifier = Modifier.padding(top = 14.dp),
        )

        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(ScreenRoute.MainScreen.screenRoute)
        }, 2000)
    }
}

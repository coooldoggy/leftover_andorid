package com.coooldoggy.leftover.ui.base

import androidx.annotation.IdRes

data class ErrorData(
    val title: String = "",
    @IdRes val image: Int = 0,
    val buttonText: String = ""
)

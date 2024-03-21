package com.dias.a30daysofwellness.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wellness(
    val day: Int = 0,
    @StringRes val summary: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val description: Int,
)

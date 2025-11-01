package com.example.a30_days_of_wellness.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class WellnessTip(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    val dayNumber: Int
)
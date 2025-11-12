package com.example.dinarateam_30_days_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Food(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
    val calories: Int,
    val protein: Int,
    val fats: Int,
    val carbs: Int
)
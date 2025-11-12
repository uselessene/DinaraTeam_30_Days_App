package com.example.dinarateam_30_days_app.model

import com.example.dinarateam_30_days_app.R
import com.example.foodapp.model.Food

object FoodDataSource {
    val foods = listOf(
        // Неделя 1: Основы и детокс
        Food(R.string.food1_name, R.string.food1_description, R.drawable.food1, 180, 5, 3, 30),
        Food(R.string.food2_name, R.string.food2_description, R.drawable.food2, 250, 4, 10, 35),
        Food(R.string.food3_name, R.string.food3_description, R.drawable.food3, 200, 3, 8, 25),
        Food(R.string.food4_name, R.string.food4_description, R.drawable.food4, 350, 12, 10, 50),
        Food(R.string.food5_name, R.string.food5_description, R.drawable.food5, 300, 10, 12, 30),
        Food(R.string.food6_name, R.string.food6_description, R.drawable.food6, 400, 15, 25, 25),
        Food(R.string.food7_name, R.string.food7_description, R.drawable.food7, 180, 10, 2, 25),

        // Неделя 2: Белки и полезные жиры
        Food(R.string.food8_name, R.string.food8_description, R.drawable.food8, 350, 25, 20, 2),
        Food(R.string.food9_name, R.string.food9_description, R.drawable.food9, 380, 20, 5, 55),
        Food(R.string.food10_name, R.string.food10_description, R.drawable.food10, 450, 15, 25, 40),
        Food(R.string.food11_name, R.string.food11_description, R.drawable.food11, 300, 35, 6, 10),
        Food(R.string.food12_name, R.string.food12_description, R.drawable.food12, 280, 25, 10, 15),
        Food(R.string.food13_name, R.string.food13_description, R.drawable.food13, 320, 22, 20, 5),
        Food(R.string.food14_name, R.string.food14_description, R.drawable.food14, 400, 12, 30, 20),

        // Неделя 3: Суперфуды и ферментированные продукты
        Food(R.string.food15_name, R.string.food15_description, R.drawable.food15, 250, 12, 5, 35),
        Food(R.string.food16_name, R.string.food16_description, R.drawable.food16, 300, 25, 8, 25),
        Food(R.string.food17_name, R.string.food17_description, R.drawable.food17, 120, 3, 1, 20),
        Food(R.string.food18_name, R.string.food18_description, R.drawable.food18, 350, 28, 10, 30),
        Food(R.string.food19_name, R.string.food19_description, R.drawable.food19, 280, 10, 15, 20),
        Food(R.string.food20_name, R.string.food20_description, R.drawable.food20, 220, 6, 10, 25),
        Food(R.string.food21_name, R.string.food21_description, R.drawable.food21, 200, 7, 8, 20),

        // Неделя 4: Завершение и закрепление
        Food(R.string.food22_name, R.string.food22_description, R.drawable.food22, 450, 30, 12, 50),
        Food(R.string.food23_name, R.string.food23_description, R.drawable.food23, 200, 7, 10, 20),
        Food(R.string.food24_name, R.string.food24_description, R.drawable.food24, 180, 4, 2, 35),
        Food(R.string.food25_name, R.string.food25_description, R.drawable.food25, 250, 6, 12, 25),
        Food(R.string.food26_name, R.string.food26_description, R.drawable.food26, 320, 30, 8, 20),
        Food(R.string.food27_name, R.string.food27_description, R.drawable.food27, 280, 5, 10, 35),
        Food(R.string.food28_name, R.string.food28_description, R.drawable.food28, 220, 3, 1, 45),
        Food(R.string.food29_name, R.string.food29_description, R.drawable.food29, 500, 30, 25, 35),
        Food(R.string.food30_name, R.string.food30_description, R.drawable.food30, 450, 20, 15, 50)
    )
}
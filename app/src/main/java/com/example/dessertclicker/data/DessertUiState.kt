package com.example.dessertclicker.data

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList
import com.example.dessertclicker.model.Dessert

data class DessertUiState(
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int =
        dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int =
        dessertList[currentDessertIndex].imageId

)

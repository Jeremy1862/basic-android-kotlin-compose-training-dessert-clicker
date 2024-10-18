package com.example.dessertclicker.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel



@Composable
fun DessertScreen(
    dessertViewModel: DessertViewModel = viewModel()
) {

    val dessertUiState by dessertViewModel.uiState.collectAsState()

}
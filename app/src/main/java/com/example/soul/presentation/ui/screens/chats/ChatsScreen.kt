package com.example.soul.presentation.ui.screens.chats

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.soul.presentation.ui.components.BottomNavigationView

@Composable
fun ChatsScreen(
    navController: NavController,
    viewModel: ChatsViewModel = viewModel()
) {
    BottomNavigationView(navController = navController)
}
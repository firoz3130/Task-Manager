package com.example.taskmanager

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route:String,
    val title:String,
    val icon:ImageVector
)
{
    object Main:BottomBarScreen(
        route = "main",
        title="MainScreen",
        icon = Icons.Default.Home
    )
    object Notes:BottomBarScreen(
        route = "notes",
        title="Notes",
        icon = Icons.Default.List
    )
    object Tasks:BottomBarScreen(
        route = "tasks",
        title="Tasks",
        icon = Icons.Default.Menu
    )
}

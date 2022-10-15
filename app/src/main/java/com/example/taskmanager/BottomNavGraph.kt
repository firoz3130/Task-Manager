package com.example.taskmanager

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.taskmanager.screens.MainScreen
import com.example.taskmanager.screens.Notes
import com.example.taskmanager.screens.Tasks

@Composable
fun BottomNavGraph(navController: NavHostController)
{
    NavHost(
        navController=navController,
        startDestination=BottomBarScreen.Main.route)
    {
        composable(route = BottomBarScreen.Main.route)
        {
            MainScreen()
        }
        composable(route = BottomBarScreen.Notes.route)
        {
            Notes()
        }
        composable(route = BottomBarScreen.Tasks.route)
        {
            Tasks()
        }
    }
}
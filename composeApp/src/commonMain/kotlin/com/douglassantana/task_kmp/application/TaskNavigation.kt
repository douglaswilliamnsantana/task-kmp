package com.douglassantana.task_kmp.application

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.douglassantana.task_kmp.feature.home.TaskHomeRoute

@Composable
fun TaskNavigation(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier,
) = NavHost(
    navController = navController,
    startDestination = "home",
    modifier = modifier.fillMaxSize()
) {
    composable(route = "home") {
        TaskHomeRoute()
    }
}
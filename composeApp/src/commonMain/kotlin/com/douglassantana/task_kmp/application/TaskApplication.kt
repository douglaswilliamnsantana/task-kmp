package com.douglassantana.task_kmp.application

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.douglassantana.task_kmp.designsystem.theme.TaskKmpTheme

@Composable
fun TaskApplication() =
    TaskKmpTheme {
        Scaffold {
            TaskNavigation()
        }
    }
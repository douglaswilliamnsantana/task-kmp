package com.douglassantana.task_kmp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.douglassantana.task_kmp.designsystem.components.header.TaskHeaderComponent
import com.douglassantana.task_kmp.designsystem.components.list.TaskListComponent
import com.douglassantana.task_kmp.designsystem.theme.TaskKmpTheme

@Composable
fun App() {
    TaskKmpTheme {
        Scaffold(topBar = { TaskHeaderComponent() }) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues = paddingValues)
                    .fillMaxSize()
            ) {
                LazyColumn {
                    items(20) {
                        TaskListComponent(
                            modifier = Modifier
                                .padding(
                                    top = 16.dp,
                                    start = 16.dp,
                                    end = 16.dp
                                )
                        )
                    }
                }
            }
        }
    }
}

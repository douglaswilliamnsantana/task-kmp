package com.douglassantana.task_kmp.feature.home

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
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TaskHomeRoute(
    modifier: Modifier = Modifier,
)  = HomeScreen(modifier = modifier)

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier
) = Scaffold(topBar = { TaskHeaderComponent() }) { paddingValues ->
    Column(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .fillMaxSize()
    ) {
        LazyColumn {
            items(20) {
                TaskListComponent(
                    modifier = Modifier
                        .padding(all = 16.dp)
                )
            }
        }
    }
}

@Composable
@Preview
private fun HomeScreenPreview() {
    TaskKmpTheme {
        HomeScreen()
    }
}
package com.douglassantana.task_kmp.designsystem.components.header

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.douglassantana.task_kmp.designsystem.theme.TaskKmpTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskHeaderComponent(
    modifier: Modifier = Modifier
) = CenterAlignedTopAppBar(
    modifier = modifier,
    actions = {},
    title = {
        Text(
            text = "Task Manager",
            modifier = Modifier
                .fillMaxWidth()
        )
    }
)

@Composable
@Preview
private fun TaskHeaderComponentPreview() {
    TaskKmpTheme {
        TaskHeaderComponent()
    }
}
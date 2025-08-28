package com.douglassantana.task_kmp

import androidx.compose.ui.window.ComposeUIViewController
import com.douglassantana.task_kmp.application.TaskApplication
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController(configure = { }) {
    TaskApplication()
}
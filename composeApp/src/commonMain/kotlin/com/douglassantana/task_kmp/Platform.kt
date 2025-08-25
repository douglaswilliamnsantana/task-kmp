package com.douglassantana.task_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
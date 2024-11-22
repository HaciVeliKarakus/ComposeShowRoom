package io.hvk.compose.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
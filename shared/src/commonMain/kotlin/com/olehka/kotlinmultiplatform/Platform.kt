package com.olehka.kotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
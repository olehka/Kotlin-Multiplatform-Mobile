package com.olehka.kotlinmultiplatform.core.di

import io.ktor.client.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.core.module.Module
import org.koin.dsl.module

fun commonModule() = module {
    single {
        HttpClient {
            defaultRequest {
                url {
                    host = "https://api.nasa.gov/"
                    url { protocol = URLProtocol.HTTPS }
                    parameters.append("api_key", "DEMO_KEY")
                }
            }
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                })
            }
        }
    }
}

expect fun platformModule(): Module

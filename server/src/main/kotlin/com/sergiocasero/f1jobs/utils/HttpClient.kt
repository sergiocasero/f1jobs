package com.sergiocasero.f1jobs.utils

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.headers
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json

val httpClient = HttpClient(CIO) {
    install(ContentNegotiation) {
        json()
    }

    defaultRequest {
        headers {
            contentType(ContentType.Application.Json)
        }
    }
}
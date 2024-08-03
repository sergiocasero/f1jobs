package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsValueX(
    @SerialName("count")
    val count: Int,
    @SerialName("descriptor")
    val descriptor: String,
    @SerialName("id")
    val id: String
)
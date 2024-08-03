package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsValue(
    @SerialName("count")
    val count: Int? = null,
    @SerialName("descriptor")
    val descriptor: String,
    @SerialName("facetParameter")
    val facetParameter: String? = null,
    @SerialName("id")
    val id: String? = null,
    @SerialName("values")
    val values: List<WilliamsValueX>? = null
)
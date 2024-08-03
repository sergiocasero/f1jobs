package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsFacet(
    @SerialName("descriptor")
    val descriptor: String? = null,
    @SerialName("facetParameter")
    val facetParameter: String? = null,
    @SerialName("values")
    val values: List<WilliamsValue>? = null
)
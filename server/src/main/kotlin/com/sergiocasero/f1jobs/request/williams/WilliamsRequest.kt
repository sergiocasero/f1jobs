package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsRequest(
    @SerialName("appliedFacets")
    val appliedFacets: WilliamsAppliedFacets,
    @SerialName("limit")
    val limit: Int,
    @SerialName("offset")
    val offset: Int,
    @SerialName("searchText")
    val searchText: String
)
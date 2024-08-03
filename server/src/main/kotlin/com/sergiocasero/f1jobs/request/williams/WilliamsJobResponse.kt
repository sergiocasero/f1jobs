package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsJobResponse(
    @SerialName("facets")
    val facets: List<WilliamsFacet>,
    @SerialName("jobPostings")
    val jobPostings: List<WilliamsJobPosting>,
    @SerialName("total")
    val total: Int,
    @SerialName("userAuthenticated")
    val userAuthenticated: Boolean
)
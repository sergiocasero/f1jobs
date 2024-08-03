package com.sergiocasero.f1jobs.request.williams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WilliamsJobPosting(
    @SerialName("bulletFields")
    val bulletFields: List<String>,
    @SerialName("externalPath")
    val externalPath: String,
    @SerialName("locationsText")
    val locationsText: String,
    @SerialName("postedOn")
    val postedOn: String,
    @SerialName("timeType")
    val timeType: String,
    @SerialName("title")
    val title: String
)
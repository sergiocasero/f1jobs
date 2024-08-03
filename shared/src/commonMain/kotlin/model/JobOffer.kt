package model

import kotlinx.serialization.Serializable

@Serializable
data class JobOffer(
    val team: F1Team,
    val family: String,
    val title: String,
    val timeType: String,
    val location: String,
    val description: String,
    val startDatetime: String,
    val applyUrl: String
)
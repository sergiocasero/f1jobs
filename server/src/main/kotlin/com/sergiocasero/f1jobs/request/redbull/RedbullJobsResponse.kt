package com.sergiocasero.f1jobs.request.redbull


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RedbullJobsResponse(
    @SerialName("Report_Entry")
    val reportEntry: List<RedbullReportEntry>
)
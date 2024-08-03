package com.sergiocasero.f1jobs.request.redbull


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RedbullReportEntry(
    @SerialName("company")
    val company: String,
    @SerialName("enddate")
    val enddate: String,
    @SerialName("external_apply_URL")
    val externalApplyURL: String,
    @SerialName("jobRequisitionId")
    val jobRequisitionId: String,
    @SerialName("jobdescription")
    val jobdescription: String,
    @SerialName("jobfamily")
    val jobfamily: String,
    @SerialName("postedOn")
    val postedOn: String,
    @SerialName("summarytext")
    val summarytext: String? = null,
    @SerialName("timetype")
    val timetype: String,
    @SerialName("title")
    val title: String,
    @SerialName("workersubtype")
    val workersubtype: String
)
package com.sergiocasero.f1jobs.scraping

import com.sergiocasero.f1jobs.request.redbull.RedbullJobsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import model.F1Team
import model.JobOffer

suspend fun getRedBullJobs(): List<JobOffer> {
    println("Getting Red Bull jobs")

    // http request to https://rbrworkday.redbull.com/, returns a json with the job offers
    // parse the json and return a list of JobOffer

    return HttpClient(CIO) {
        install(ContentNegotiation) {
            json()
        }
    }.use {
        it.get {
            url {
                protocol = URLProtocol.HTTPS
                host = "rbrworkday.redbull.com"
            }
        }.body<RedbullJobsResponse>().toJobOffers()
    }
}

private fun RedbullJobsResponse.toJobOffers(): List<JobOffer> {
    return reportEntry.map {
        JobOffer(
            team = F1Team.RED_BULL,
            title = it.title,
            description = it.jobdescription,
            applyUrl = it.externalApplyURL,
            startDatetime = it.postedOn,
            location = "Milton Keynes",
            timeType = it.timetype,
            family = it.jobfamily,
        )
    }
}
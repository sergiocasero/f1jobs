package com.sergiocasero.f1jobs.scraping

import com.sergiocasero.f1jobs.request.williams.WilliamsAppliedFacets
import com.sergiocasero.f1jobs.request.williams.WilliamsJobResponse
import com.sergiocasero.f1jobs.request.williams.WilliamsRequest
import com.sergiocasero.f1jobs.utils.httpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.URLProtocol
import io.ktor.http.path
import model.F1Team
import model.JobOffer

suspend fun getWilliamsJobs(): List<JobOffer> {
    return httpClient.use {
        it.post {
            url {
                protocol = URLProtocol.HTTPS
                host = "alcority.wd1.myworkdayjobs.com"
                path("wday/cxs/alcority/WilliamsRacing/jobs")
            }
            setBody(
                WilliamsRequest(
                    appliedFacets = WilliamsAppliedFacets(),
                    limit = 20,
                    offset = 0,
                    searchText = ""
                )
            )
        }
    }.body<WilliamsJobResponse>().toJobOffers()

}

private fun WilliamsJobResponse.toJobOffers(): List<JobOffer> {
    return jobPostings.map {
        JobOffer(
            team = F1Team.WILLIAMS,
            title = it.title,
            description = "it.jobDescription",
            applyUrl = it.externalPath,
            startDatetime = it.postedOn,
            location = it.locationsText,
            timeType = it.timeType,
            family = "t.jobFamily",
        )
    }
}
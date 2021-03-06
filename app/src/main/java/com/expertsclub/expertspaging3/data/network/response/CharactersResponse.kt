package com.expertsclub.expertspaging3.data.network.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharactersResponse(
    val info: InfoResponse,
    val results: List<ResultsResponse>
)
package com.kmpdemo.domain.entities.match

data class MatchResponse(
    val status: String? = null,
    val data: List<MatchItem>? = null
)

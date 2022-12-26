package com.olehka.kotlinmultiplatform.planetary.data.network.model

import com.olehka.kotlinmultiplatform.planetary.domain.model.PictureDetails

data class PictureDetailsEntity(
    private val title: String,
    private val explanation: String,
    private val url: String
) {
    companion object {
        val empty = PictureDetailsEntity("", "", "")
    }

    fun toPictureDetails() = PictureDetails(title, explanation, url)
}

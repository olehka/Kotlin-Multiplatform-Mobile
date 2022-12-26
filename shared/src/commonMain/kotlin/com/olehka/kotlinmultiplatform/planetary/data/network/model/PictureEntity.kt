package com.olehka.kotlinmultiplatform.planetary.data.network.model

import com.olehka.kotlinmultiplatform.planetary.domain.model.Picture

data class PictureEntity(private val title: String, private val url: String) {

    fun toPicture() = Picture(title, url)
}

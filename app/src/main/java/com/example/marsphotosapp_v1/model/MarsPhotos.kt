package com.example.marsphotosapp_v1.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhotos(
    val id: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)

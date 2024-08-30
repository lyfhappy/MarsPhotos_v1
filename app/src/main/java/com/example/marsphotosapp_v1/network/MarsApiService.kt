package com.example.marsphotosapp_v1.network

import com.example.marsphotosapp_v1.model.MarsPhotos
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhotos>
}
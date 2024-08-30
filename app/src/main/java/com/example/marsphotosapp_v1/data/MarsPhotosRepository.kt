package com.example.marsphotosapp_v1.data

import com.example.marsphotosapp_v1.model.MarsPhotos
import com.example.marsphotosapp_v1.network.MarsApiService

interface MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi */
    suspend fun getMarsPhotos(): List<MarsPhotos>
}

/**
 * Network Implementation of Repository that fetch mars photos list from marsApi.
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi*/
    override suspend fun getMarsPhotos(): List<MarsPhotos> = marsApiService.getPhotos()
}
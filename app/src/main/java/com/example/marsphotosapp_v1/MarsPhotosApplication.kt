package com.example.marsphotosapp_v1

import android.app.Application
import com.example.marsphotosapp_v1.data.AppContainer
import com.example.marsphotosapp_v1.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
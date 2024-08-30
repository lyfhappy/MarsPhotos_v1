package com.example.marsphotosapp_v1

import MarsPhotosApp
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.marsphotosapp_v1.Screens.MarsViewModel
import com.example.marsphotosapp_v1.ui.theme.MarsPhotosApp_v1Theme

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
class MainActivity : ComponentActivity() {
    private val viewModel: MarsViewModel by viewModels { MarsViewModel.Factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarsPhotosApp_v1Theme {
                MarsPhotosApp(viewModel)
                }
            }
        }
    }

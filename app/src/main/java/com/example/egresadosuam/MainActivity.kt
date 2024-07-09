package com.example.egresadosuam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.egresadosuam.activities.Login
import com.example.egresadosuam.ui.theme.EgresadosUAMTheme
import com.example.egresadosuam.ui.theme.UAMPrimary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EgresadosUAMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Login(paddingValues = innerPadding)
                }
            }
        }
    }
}
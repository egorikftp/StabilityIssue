package com.egoriku.stabilityissue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.egoriku.mylibrary.TestState
import com.egoriku.stabilityissue.ui.theme.StabilityIssueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StabilityIssueTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val appState = remember { TestState("kek") }
                    TopBanner(state = appState)
                }
            }
        }
    }
}

@Composable
private fun TopBanner(state: TestState) {
    Text(text = "Hello ${state.name}!")
}

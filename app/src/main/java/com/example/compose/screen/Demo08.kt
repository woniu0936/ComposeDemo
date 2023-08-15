package com.example.compose.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun GreetingClickablePage() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .requiredSize(200.dp)
            .background(Color.Blue)
            .clickable {
                Toast
                    .makeText(context, "Box is clicked", Toast.LENGTH_SHORT)
                    .show()
            }
    )
}
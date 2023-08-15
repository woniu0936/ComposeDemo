package com.example.compose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun GreetingVerticalScrollPage() {
    Column(
        modifier = Modifier
            .requiredSize(200.dp)
            .background(Color.Blue)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(10) {
            Text(
                text = "item is $it",
                color = Color.White,
                fontSize = 26.sp
            )
        }
    }
}
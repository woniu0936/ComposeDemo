package com.example.compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R

@Preview
@Composable
fun GreetingTaskPage() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.wrapContentSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = "task",
            )
            Text(
                text = "All tasks completed",
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Nice work!",
                fontSize = 16.sp
            )
        }
    }
}
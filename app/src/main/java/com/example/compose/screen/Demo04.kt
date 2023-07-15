package com.example.compose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.R

@Preview
@Composable
fun GreetingQuadrant() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposeCardInfo(
                modifier = Modifier.weight(1f),
                title = stringResource(id = R.string.first_title),
                content = stringResource(id = R.string.first_description),
                backgroundColor = Color.Green
            )
            ComposeCardInfo(
                modifier = Modifier.weight(1f),
                title = stringResource(id = R.string.second_title),
                content = stringResource(id = R.string.second_description),
                backgroundColor = Color.Yellow
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposeCardInfo(
                modifier = Modifier.weight(1f),
                title = stringResource(id = R.string.third_title),
                content = stringResource(id = R.string.third_description),
                backgroundColor = Color.Cyan
            )
            ComposeCardInfo(
                modifier = Modifier.weight(1f),
                title = stringResource(id = R.string.fourth_title),
                content = stringResource(id = R.string.fourth_description),
                backgroundColor = Color.LightGray
            )
        }
    }
}

@Composable
fun ComposeCardInfo(
    title: String,
    content: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            color = Color.Black,
            textAlign = TextAlign.Justify
        )
    }
}
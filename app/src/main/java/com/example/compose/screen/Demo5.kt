package com.example.compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R

@Preview
@Composable
fun GreetingMailPage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(164.dp),
                painter = painterResource(id = R.drawable.ic_mail),
                contentDescription = null
            )
            Text(
                text = "Full Name",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Title",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Column(verticalArrangement = Arrangement.Bottom) {
            RowInfo(painter = painterResource(id = R.drawable.ic_phone), content = stringResource(id = R.string.mail_phone))
            RowInfo(painter = painterResource(id = R.drawable.ic_mail), content = stringResource(id = R.string.mail_address))
            RowInfo(painter = painterResource(id = R.drawable.ic_country), content = stringResource(id = R.string.mail_country))
        }
    }

}

@Composable
fun RowInfo(
    painter: Painter,
    content: String
) {
    Row(modifier = Modifier.padding(top = 16.dp)) {
        Image(
            modifier = Modifier.padding(start = 32.dp),
            painter = painter, contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = content,
            fontSize = 16.sp
        )
    }
}
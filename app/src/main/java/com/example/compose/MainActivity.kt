package com.example.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.compose.screen.GreetingClickablePage
import com.example.compose.screen.GreetingDragXYPage
import com.example.compose.screen.GreetingDraggablePage
import com.example.compose.screen.GreetingIconPage
import com.example.compose.screen.GreetingInputPage
import com.example.compose.screen.GreetingMailPage
import com.example.compose.screen.GreetingQuadrant
import com.example.compose.screen.GreetingTaskPage
import com.example.compose.screen.GreetingVerticalScrollPage
import com.example.compose.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    SimpleWidgetColumn()
//                    GreetingArticlePage()
//                    GreetingTaskPage()
//                    GreetingQuadrant()
//                    GreetingMailPage()
//                    GreetingIconPage()
//                    GreetingInputPage()
//                    GreetingClickablePage()
//                    GreetingVerticalScrollPage()
//                    GreetingDraggablePage()
                    GreetingDragXYPage()
                }
            }
        }
    }

}

@Preview
@Composable
fun SimpleWidgetColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "this is a text",
            color = Color.Black,
            fontSize = 26.sp
        )
        val context = LocalContext.current
        Button(onClick = {
            Toast.makeText(context, "this is a toast", Toast.LENGTH_SHORT).show()
        }) {
            Text(
                text = "this is a button",
                color = Color.White,
                fontSize = 26.sp
            )
        }
        TextField(value = "", onValueChange = {}, placeholder = {
            Text(text = "this is hint text")
        },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Gray,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.Yellow,
            )
        )
        Text(text = "使用drawable显示图片")
        Image(
            modifier = Modifier.wrapContentSize(),
            painter = painterResource(id = R.drawable.ic_cat),
            contentDescription = "this is a image"
        )
        Text(text = "使用bitmap显示图片")
        val bitmap: ImageBitmap = ImageBitmap.imageResource(id = R.drawable.ic_cat)
        Image(
            modifier = Modifier.wrapContentSize(),
            bitmap = bitmap,
            contentDescription = "this is a image"
        )
        Text(text = "使用coil库加载网络图片")
        AsyncImage(
            model = "https://images.pexels.com/photos/1170986/pexels-photo-1170986.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            contentDescription = "load image from network"
        )
        CircularProgressIndicator(
            color = Color.Blue,
            strokeWidth = 8.dp
        )
        LinearProgressIndicator(
            color = Color.Red,
            trackColor = Color.Gray
        )
    }
}


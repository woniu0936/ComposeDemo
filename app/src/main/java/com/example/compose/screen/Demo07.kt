package com.example.compose.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun GreetingInputPage() {
    Box(
        modifier = Modifier
            .requiredSize(200.dp)
            .background(Color.Blue)
            .pointerInput(null) {
                awaitPointerEventScope {
                    while (true) {
                        val event = awaitPointerEvent()
//                        Log.d("pointerInput", "event: ${event.type}")
                    }
                }
            }
            .pointerInput(null) {
                //注意这两个事件不能在同一个pointerInput()函数中监听，因为detectTapGestures和detectDragGestures函数都是阻塞性的，调用了之后下面的一行代码就永远不会执行到了。
                detectTapGestures {
                    Log.d("pointerInput", "detectTapGestures")
                }
            }
            .pointerInput(null) {
                detectDragGestures { _, _ ->
                    Log.d("pointerInput", "detectDragGestures")
                }
            }
    )
}
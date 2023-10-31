package com.example.compose.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose.MainViewModel

@Composable
fun GreetingCounter(modifier: Modifier = Modifier) {
//    var count by remember { mutableIntStateOf(0) }
//    var count by rememberSaveable { mutableIntStateOf(0) }
//    Column(
//        modifier = modifier,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "$count",
//            fontSize = 50.sp
//        )
//        Button(onClick = { count++ }) {
//            Text(
//                text = "click me",
//                fontSize = 26.sp
//            )
//        }
//    }
    CallCounter(modifier)
}

@Composable
fun CallCounter(modifier: Modifier = Modifier, viewModel: MainViewModel = viewModel()) {
//    var count by rememberSaveable { mutableIntStateOf(0) }
//    var doubleCount by rememberSaveable { mutableIntStateOf(0) }
    val count by viewModel.count.collectAsState()
    val doubleCount by viewModel.doubleCount.collectAsState()
    Column {
        Counter(count = count, onIncrement = { viewModel.incrementCount() }, modifier = modifier.fillMaxWidth())
        Counter(count = doubleCount, onIncrement = { viewModel.incrementDoubleCount() }, modifier = modifier.fillMaxWidth())
    }

}

@Composable
fun Counter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$count",
            fontSize = 50.sp
        )
        Button(onClick = { onIncrement() }) {
            Text(
                text = "click me",
                fontSize = 26.sp
            )
        }
    }
}


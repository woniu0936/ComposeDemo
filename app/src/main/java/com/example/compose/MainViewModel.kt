package com.example.compose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    private val _doubleCount = MutableStateFlow(0)

    val count = _count.asStateFlow()
    val doubleCount = _doubleCount.asStateFlow()

    fun incrementCount() {
        _count.value += 1
    }

    fun incrementDoubleCount() {
        _doubleCount.value += 2
    }

}
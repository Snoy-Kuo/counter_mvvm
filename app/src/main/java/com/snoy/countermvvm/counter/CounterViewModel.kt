package com.snoy.countermvvm.counter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    // state: counterValue
    var counterValue by mutableStateOf(0)
        private set

    // event: incrementCount
    fun incrementCount() {
        counterValue++
    }
}
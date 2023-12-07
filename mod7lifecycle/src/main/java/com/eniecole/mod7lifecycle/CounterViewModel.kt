package com.eniecole.mod7lifecycle

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter = 0
    fun inc() = ++counter
}
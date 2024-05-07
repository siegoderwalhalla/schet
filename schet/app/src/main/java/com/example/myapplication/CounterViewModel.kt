package com.example.myapplication

import androidx.lifecycle.ViewModel
class CounterViewModel : ViewModel() {
    private var counter = 0

    fun getNext() = ++counter

    fun getCurrent() = counter

    fun getPrev() = --counter
}
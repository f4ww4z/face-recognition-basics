package com.jagoancoding.facerecognitionbasics.ui.start

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartViewModel : ViewModel() {
    private val _hello = MutableLiveData<String>()
    val hello: LiveData<String>
        get() = _hello

    init {
        _hello.value = "Hello world!"
    }
}

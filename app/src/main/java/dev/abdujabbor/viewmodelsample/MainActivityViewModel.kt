package dev.abdujabbor.viewmodelsample

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    var count = 0
    fun getFirstCount():Int{
        return count
    }
    fun updateCount():Int{
        return ++count
    }
}
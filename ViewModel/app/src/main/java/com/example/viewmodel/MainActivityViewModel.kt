package com.example.viewmodel

import androidx.lifecycle.ViewModel
/*
** View model hold and manage ui-related data in life cycle conscious way
so that we don't loose our data during configuration changes like screen rotation

view model is also used to separate data related calculation from ui implementation
view model provider class is used to connect ui controller with view model
 */

class MainActivityViewModel: ViewModel() {
    var number= 0
    fun addOne(){
        number++
    }
}
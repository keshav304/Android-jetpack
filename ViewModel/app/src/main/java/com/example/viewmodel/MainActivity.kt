package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        view model provider class is used to connect ui controller with view model
        which takes the context of an activity

        ** view model is not used for data persistence by itself
         */
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textView.text = viewModel.number.toString()
        button.setOnClickListener{
            viewModel.addOne()
            textView.text = viewModel.number.toString()
        }
    }
}
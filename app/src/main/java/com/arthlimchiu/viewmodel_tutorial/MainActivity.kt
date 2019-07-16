package com.arthlimchiu.viewmodel_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var viewModelFactory: MainViewModelFactory

    private lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = MainViewModelFactory(UserRepository())
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

        username = findViewById(R.id.username_txt)

        username.text = viewModel.getUsername()
    }
}
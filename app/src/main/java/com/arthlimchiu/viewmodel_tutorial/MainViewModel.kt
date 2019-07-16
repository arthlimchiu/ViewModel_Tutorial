package com.arthlimchiu.viewmodel_tutorial

import androidx.lifecycle.ViewModel

class MainViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getUsername(): String {
        return userRepository.getUsername()
    }
}
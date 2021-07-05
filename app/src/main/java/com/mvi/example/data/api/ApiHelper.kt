package com.mvi.example.data.api

import com.mvi.example.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>

}
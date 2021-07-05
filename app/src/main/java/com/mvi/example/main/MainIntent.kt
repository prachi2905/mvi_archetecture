package com.mvi.example.main


sealed class MainIntent {
    object FetchUser : MainIntent()
}
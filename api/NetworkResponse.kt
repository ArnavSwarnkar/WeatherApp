package com.example.weatherapp.api

sealed class NetworkResponse<out T> {
    data class Success<out T>(val data: T): NetworkResponse<T>()
    data class Error<out T>(val message: String): NetworkResponse<T>()
    object Loading: NetworkResponse<Nothing>()
}
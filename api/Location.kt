package com.example.weatherapp.api

data class Location(
    val name: String,
    val country: String,
    val lat: String,
    val localtime: String,
    val localtime_epoch: String,
    val lon: String,
    val region: String,
    val tz_id: String
)

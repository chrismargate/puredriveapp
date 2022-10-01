package com.example.puredriveapp.dataclasses

data class Location(
    val locationID: Int,
    val lotno: String,
    val addressline: String,
    val addressline2: String,
    val state: String,
    val city: String,
    val country: String,
    val zipcode: String
)

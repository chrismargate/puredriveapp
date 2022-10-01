package com.example.puredriveapp.dataclasses

data class Customer(
    val customerID: Int,
    val userID: Int,
    val billingLocationID: Int,
    val shippingLocationID: Int,
    val recentSearch: String,
    val lastRentedVehicle: Int,
    val lastUsedPayment: String
)
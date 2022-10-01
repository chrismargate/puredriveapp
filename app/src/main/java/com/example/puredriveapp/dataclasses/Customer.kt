package com.example.puredriveapp.dataclasses

data class Customer(
    val CustomerID: Int,
    val UserID: Int,
    val BillingLocationID: Int,
    val ShippingLocationID: Int,
    val RecentSearch: String,
    val LastRentedVehicle: Int,
    val LastUsedPayment: String
)
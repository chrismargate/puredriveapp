package com.example.puredriveapp.dataclasses

import android.media.Image

data class Vehicle(
    var Name: String,
    var Price: String,
    var Location: String,
    var Thumbnail: Int
)

/*
data class Vehicle(
    var Availability: String? = null,
    var AvailabilityStartDate: String? = null,
    var AvailabilityEndDate: String? = null,
    var Brand: String? = null,
    var Model: String? = null,
    var ModelYear: String? = null,
    var PhotoID: Int? = null,
    var PlateNo: String? = null,
    var RentCost: Double? = null,
    var Rental: Rental? = null,
    var RentalID: Int? = null,
    var RentalPeriod: String? = null,
    var Status: String? = null,
    var ThumbnailID: Int? = null,
    var Transmission: String? = null,
    var UpdatedDateTime: String? = null,
    var VehicleDataID: Int? = null,
    var VehicleID: Int? = null
)
 */
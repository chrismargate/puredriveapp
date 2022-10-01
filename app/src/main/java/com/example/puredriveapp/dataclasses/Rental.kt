package com.example.puredriveapp.dataclasses

import android.os.Parcel
import android.os.Parcelable

data class Rental(
    var RentalID: Int = 0,
    var RentalName: String = "",
    var LocationID: Int = 0,
    var BusinessContact: String = "",
    var BusinessLinks: String = "",
    var LogoID: Int = 0,
    var WorkingDayStart: String = "",
    var WorkingDayEnd: String = "",
    var WorkingHoursStart: String = "",
    var WorkingHourEnd: String = "",
    var CreatedDate: String = "",
    var CreatedTime: String = "",
    var UpdatedDateTime: String = "",
    var OwnershipType: String = "",
    var VehicleCategories: String = "",
    var PaymentMode: String = "",
    var Description: String = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Rental> {
        override fun createFromParcel(parcel: Parcel): Rental {
            return Rental(parcel)
        }

        override fun newArray(size: Int): Array<Rental?> {
            return arrayOfNulls(size)
        }
    }
}
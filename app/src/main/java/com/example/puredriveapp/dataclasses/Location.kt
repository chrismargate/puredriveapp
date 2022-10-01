package com.example.puredriveapp.dataclasses

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class Location(
    var LocationID: Int = 0,
    var Lotno: String = "",
    var Addressline: String = "",
    var Addressline2: String = "",
    var State: String = "",
    var City: String = "",
    var Country: String = "",
    var Zipcode: String= ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
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
        return 0
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Location> {
        override fun createFromParcel(parcel: Parcel): Location {
            return Location(parcel)
        }

        override fun newArray(size: Int): Array<Location?> {
            return arrayOfNulls(size)
        }
    }
}

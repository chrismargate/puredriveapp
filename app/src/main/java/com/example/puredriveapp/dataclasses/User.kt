package com.example.puredriveapp.dataclasses

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/*
data class User(
    var UserID: Int = 0,
    var RoleID: Int = 0,
    var CreatedDateTime: String = "",
    var UpdatedDateTime: String = "",
    var Username: String = "",
    var Password: String = "",
    var EmailAddress: String = "",
    var ProfilePicture: Int = 0,
    var Fname: String = "",
    var Mname: String = "",
    var Lname: String = "",
    var Gender: String = "",
    var PhoneNo: String = "",
    var DateOfBirth: String = "",
    var LastOnline: String = ""
) : Serializable
*/

data class User(
    var UserID: Int = 0,
    var RoleID: Int = 0,
    var CreatedDateTime: String = "",
    var UpdatedDateTime: String = "",
    var Username: String = "",
    var Password: String = "",
    var EmailAddress: String = "",
    var ProfilePicture: Int = 0,
    var Fname: String = "",
    var Mname: String = "",
    var Lname: String = "",
    var Gender: String = "",
    var PhoneNo: String = "",
    var DateOfBirth: String = "",
    var LastOnline: String = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
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

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}

package com.example.puredriveapp.dataclasses

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
)

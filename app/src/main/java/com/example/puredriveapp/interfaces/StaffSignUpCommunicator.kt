package com.example.puredriveapp.interfaces

import androidx.fragment.app.Fragment
import com.example.puredriveapp.dataclasses.*

interface StaffSignUpCommunicator {

    //fun getStaffData(stafData: )
    fun loadNextFragment(nextResource: Int, nextFragment: Fragment)
    /*
    fun getUserData(userData: User)
    fun getStaffData(staffData: Staff)
     */
}
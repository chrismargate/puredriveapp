package com.example.puredriveapp

import androidx.fragment.app.Fragment

interface StaffSignUpCommunicator {

    //fun getStaffData(stafData: )
    fun loadNextFragment(nextResource: Int, nextFragment: Fragment)
}
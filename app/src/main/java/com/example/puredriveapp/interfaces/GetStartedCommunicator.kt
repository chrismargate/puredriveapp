package com.example.puredriveapp.interfaces

import androidx.fragment.app.Fragment

@FunctionalInterface
interface GetStartedCommunicator {
     fun loadNextFragment(nextResource: Int, nextFragment: Fragment)
     fun getData(userType: String)
}
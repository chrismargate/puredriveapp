package com.example.puredriveapp

import androidx.fragment.app.Fragment

interface GetStartedCommunicator {
    fun loadNextFragment(nextResource: Int, nextFragment: Fragment)
}
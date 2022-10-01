package com.example.puredriveapp.fragments.signup.staff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.puredriveapp.R
import com.example.puredriveapp.dataclasses.Location
import com.example.puredriveapp.dataclasses.User
import com.example.puredriveapp.interfaces.StaffSignUpCommunicator
import kotlinx.android.synthetic.main.fragment_staff_sign_up3.view.*
import kotlinx.android.synthetic.main.fragment_staff_sign_up4.view.*
import kotlinx.android.synthetic.main.fragment_staff_sign_up4.view.ibtnNext

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StaffSignUp4Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StaffSignUp4Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var userData: User
    private lateinit var locationData: Location
    private lateinit var communicator: StaffSignUpCommunicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_staff_sign_up4, container, false)

        var bundle = Bundle()
        communicator = activity as StaffSignUpCommunicator
        var nextFragment = StaffSignUp4Fragment()

        userData = User()
        locationData = Location()
        userData = arguments?.getParcelable<User>("User Data")!!
        locationData = arguments?.getParcelable<Location>("Location Data")!!

        /* test code
        val sample_string: String = userData.Fname + " " + userData.Lname + " " + userData.DateOfBirth + " " + userData.Gender + " " + userData.EmailAddress + " " + userData.PhoneNo + " " + userData.Username + " " + userData.Password
        Toast.makeText(activity,sample_string ,Toast.LENGTH_LONG).show()
         */

        view.ibtnNext.setOnClickListener {
            Toast.makeText(activity, "You clicked this", Toast.LENGTH_LONG).show()

            locationData.State = view.staff_state.text.toString()
            locationData.City = view.staff_city.text.toString()
            locationData.Country = view.staff_country.text.toString()
            locationData.Zipcode = view.staff_zip.text.toString()

            bundle.putParcelable("Location Data", locationData)
            bundle.putParcelable("User Data", userData)
            nextFragment.arguments = bundle
            communicator.loadNextFragment(R.id.frameStaffSignUp,nextFragment)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StaffSignUp4Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StaffSignUp4Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
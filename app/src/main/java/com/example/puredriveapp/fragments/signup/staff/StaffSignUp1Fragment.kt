package com.example.puredriveapp.fragments.signup.staff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.puredriveapp.R
import com.example.puredriveapp.dataclasses.*
import com.example.puredriveapp.interfaces.StaffSignUpCommunicator
import kotlinx.android.synthetic.main.activity_staff_signup.*
import kotlinx.android.synthetic.main.fragment_staff_sign_up1.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StaffSignUp2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StaffSignUp1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    /*
    private var _binding: FragmentStaffSignUp1Binding? = null
    private val binding get() = _binding!!

     */

    private lateinit var communicator: StaffSignUpCommunicator
    private lateinit var userData: User

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
        val view =  inflater.inflate(R.layout.fragment_staff_sign_up1, container, false)

        /*
        _binding = FragmentStaffSignUp1Binding.inflate(inflater, container, false)

        val gender = resources.getStringArray(R.array.Gender)
        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.dropdown_item, gender)
        binding.actvGender.setAdapter(arrayAdapter)
        */

        var bundle = Bundle()
        communicator = activity as StaffSignUpCommunicator
        var nextFragment = StaffSignUp2Fragment()
        userData = User()

        view.ibtnNext.setOnClickListener{
            Toast.makeText(activity, "You clicked this", Toast.LENGTH_LONG).show()

            // takes user input from text fields and stores in a user class
            userData.Fname = view.staff_firstName.text.toString()
            userData.Lname = view.staff_lastName.text.toString()
            userData.DateOfBirth = view.staff_dateBirth.text.toString()
            //userData.Gender = view.staff_gender.text.toString()

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
         * @return A new instance of fragment StaffSignUp2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StaffSignUp2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
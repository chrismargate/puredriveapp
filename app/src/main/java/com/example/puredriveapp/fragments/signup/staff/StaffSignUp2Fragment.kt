package com.example.puredriveapp.fragments.signup.staff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.puredriveapp.R
import com.example.puredriveapp.dataclasses.User
import com.example.puredriveapp.interfaces.StaffSignUpCommunicator
import kotlinx.android.synthetic.main.fragment_staff_sign_up1.view.*
import kotlinx.android.synthetic.main.fragment_staff_sign_up2.view.*
import kotlinx.android.synthetic.main.fragment_staff_sign_up2.view.ibtnNext

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StaffSignUp2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StaffSignUp2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        val view = inflater.inflate(R.layout.fragment_staff_sign_up2, container, false)

        val bundle = Bundle()
        communicator = activity as StaffSignUpCommunicator
        var nextFragment = StaffSignUp3Fragment()
        userData = User()

        userData = arguments?.getParcelable<User>("User Data")!!;

        /* test code
        userData = arguments?.getParcelable<User>("User Data")!!;
        val sample_string: String = userData.Fname + " " + userData.Lname + " " + userData.DateOfBirth + " " + userData.Gender
        Toast.makeText(activity,sample_string ,Toast.LENGTH_LONG).show()

         */

        view.ibtnNext.setOnClickListener {
            Toast.makeText(activity, "You clicked this", Toast.LENGTH_LONG).show()

            userData.EmailAddress = view.staff_emailad.text.toString()
            userData.PhoneNo = view.staff_phoneno.text.toString()
            userData.Username = view.staff_username.text.toString()
            userData.Password = view.staff_passw.text.toString()

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
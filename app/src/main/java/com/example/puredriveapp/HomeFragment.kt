package com.example.puredriveapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: VehicleRecyclerAdapter
    lateinit var vehicleArrayList: ArrayList<Vehicle>

    lateinit var names: Array<String>
    lateinit var price: Array<String>
    lateinit var location: Array<String>

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
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun fetchVehicleHome(){

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeData()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvVehicles)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = VehicleRecyclerAdapter(vehicleArrayList)
        recyclerView.adapter = adapter
    }

    private fun initializeData() {
        vehicleArrayList = arrayListOf<Vehicle>()
        /*
        names = arrayOf(
            "Toyota Supra",
            "Toyota Fortuner",
            "Lamborghini Aventador"
        )

         */

        names = arrayOf(
            "Honda Civic",
            "Ferrari Italia",
            "Mini Cooper"
        )
        price = arrayOf(
            "3499",
            "2000",
            "6999"
        )
        location = arrayOf(
            "Pasig, NCR",
            "Makati, NCR",
            "Mandaluyong, NCR"
        )

        for(i in names.indices){
            val vehicles = Vehicle(names[i],price[i],location[i])
            vehicleArrayList.add(vehicles)
        }
    }
}
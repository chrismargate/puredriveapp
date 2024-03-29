package com.example.puredriveapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import android.content.Intent
import com.example.puredriveapp.dataclasses.Vehicle
import kotlinx.android.synthetic.main.fragment_home2.*

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
    lateinit var thumbnail: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        /*
        btnVehicleRent.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), SupraDescActivity::class.java)
            startActivity(intent)
        }

         */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
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
/*
    private fun fetchVehicleHome(){
        val url = "https://my-python-test-api.herokuapp.com/api/vehicle"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {

                try{
                    val body = response?.body?.string()
                    println(body)

                    val gson = GsonBuilder().create()

                    val vehicles: List<Vehicle> = gson.fromJson(body, Array<Vehicle>::class.java).toList()
                    vehicleArrayList = vehicles as ArrayList<Vehicle>

                }catch (e: Exception){
                    e.printStackTrace()
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                println("Failed to execute request")
            }
        })

    }

 */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rentbtn2.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), SupraDescActivity::class.java)
            startActivity(intent)
        }

        textView3.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), SupraDescActivity::class.java)
            startActivity(intent)
        }
        //initializeData()
        //fetchVehicleHome()
        /*
        initializeData()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvVehicles)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = VehicleRecyclerAdapter(vehicleArrayList)
        recyclerView.adapter = adapter

         */

        /*
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvVehicles)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = VehicleRecyclerAdapter(vehicleArrayList)
        recyclerView.adapter = adapter

         */

    }

    private fun initializeData() {
        vehicleArrayList = arrayListOf<Vehicle>()

        names = arrayOf(
            "Toyota Supra",
            "Toyota Fortuner",
            "Lamborghini Aventador"
        )

        price = arrayOf(
            "PHP 3499",
            "PHP 2000",
            "PHP 6999"
        )

        location = arrayOf(
            "Pasig, NCR",
            "Makati, NCR",
            "Mandaluyong, NCR"
        )

        thumbnail = arrayOf(
            R.drawable.supra2,
            R.drawable.fortuner,
            R.drawable.lambo
        )

        for(i in names.indices){
            val vehicles = Vehicle(names[i],price[i],location[i],thumbnail[i])
            vehicleArrayList.add(vehicles)
        }
    }
}
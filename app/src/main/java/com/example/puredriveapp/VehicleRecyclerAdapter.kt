package com.example.puredriveapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.puredriveapp.dataclasses.Vehicle

class VehicleRecyclerAdapter(private val vehicleList: ArrayList<Vehicle>) : RecyclerView.Adapter<VehicleRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return vehicleList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentVehicle = vehicleList[position]
        /*
        holder.vehicleName.text = String.format("%s %s",currentVehicle.Brand,currentVehicle.Model)
        holder.vehiclePrice.text = currentVehicle.RentCost.toString()
        holder.vehicleLocation.text = String.format("%s, %s, %s",currentVehicle.Rental!!.City,currentVehicle.Rental!!.State,currentVehicle.Rental!!.Country)
         */
        holder.vehicleName.text = currentVehicle.Name
        holder.vehiclePrice.text = currentVehicle.Price
        holder.vehicleLocation.text = currentVehicle.Location
        holder.vehicleImage.setImageResource(currentVehicle.Thumbnail)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //val vehicleButton: Button? = null
        val vehicleName: TextView = itemView.findViewById(R.id.tvVehicleName)
        val vehiclePrice: TextView = itemView.findViewById(R.id.tvVehiclePrice)
        val vehicleLocation: TextView = itemView.findViewById(R.id.tvVehicleLocation)
        val vehicleImage: ImageView = itemView.findViewById(R.id.ivVehicleThumbnail)
        val vehicleButton: Button = itemView.findViewById<Button>(R.id.btnVehicleRent)

        //val btnVehicle : Button = itemView.findViewById(R.id.btnVehicleRent)

    }

}
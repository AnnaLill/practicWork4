package com.ld.api

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ld.api.databinding.CustomViewBinding

class ApiAdapter : RecyclerView.Adapter<ApiAdapter.ApiHolder>() {
    val apiList = ArrayList<ApiDataClass>()
    class ApiHolder(item: View) : RecyclerView.ViewHolder(item) {
        val apiBinding = CustomViewBinding.bind(item)
        fun bind(api: ApiDataClass) = with(apiBinding) {

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_view, parent, false)
        return ApiHolder(view)
    }

    override fun onBindViewHolder(holder: ApiHolder, position: Int) {
        holder.bind(apiList[position])
    }

    override fun getItemCount(): Int {
        return apiList.size
    }
    fun addView(item:ApiDataClass){
        apiList.add(item)
        notifyDataSetChanged()
    }
}
package com.ld.api

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ld.api.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val adapter = ApiAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var list = ApiDataGet.list
            Retrofit.create.getMessage()
                .enqueue(object : Callback<ApiDataClass> {
                    @RequiresApi(Build.VERSION_CODES.P)
                    override fun onResponse(
                        call: Call<ApiDataClass>,
                        response: Response<ApiDataClass>
                    ) {

                    }
                    override fun onFailure(call: Call<ApiDataClass>, t: Throwable) {}
                })

        }

}
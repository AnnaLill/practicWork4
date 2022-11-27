package com.ld.api
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


object Retrofit {
    private const val apiName = "https://api.thecatapi.com/"
    private val retrofit = Retrofit.Builder()//Создание построителя ретрофита
        .baseUrl(apiName)//Добавление адреса сайта для работы ретрофита
        .addConverterFactory(GsonConverterFactory.create())//Создание конвертации фабрики по конвертации данных
        .build()//создание объекта ретрофит
    val create:API = retrofit.create(API::class.java)//Создание сервиса

}
interface API{//Создание интерфейса сервиса

    @Headers(
        "Accept: application/json",
        "Content-Type: application/json"
    )
    @GET("https://api.thecatapi.com/")//Указание адреса для передачи данных
    fun getMessage(@Query ("limit") limit:Int = 1) : Call<ApiDataClass>//Отправка в теле сообщения данных дата класса

}
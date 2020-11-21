package com.coderpig.sunnyweather.logic.network

import com.coderpig.sunnyweather.SunnyWeatherApplication
import com.coderpig.sunnyweather.logic.model.DailyResponse
import com.coderpig.sunnyweather.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String) : retrofit2.Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String) : retrofit2.Call<DailyResponse>
}
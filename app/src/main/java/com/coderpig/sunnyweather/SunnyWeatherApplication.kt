package com.coderpig.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        const val TOKEN = "uarbY2Oh1y9Q2bBg"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
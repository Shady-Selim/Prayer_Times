package com.shady_selim.prayer_times

data class PrayersModel(
    val city: String,
    val fajr: String,
    val dhuhr: String,
    val asr: String,
    val maghrib: String,
    val isha: String
)
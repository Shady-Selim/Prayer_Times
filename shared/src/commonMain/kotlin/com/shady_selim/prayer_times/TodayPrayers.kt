package com.shady_selim.prayer_times

import com.batoulapps.adhan2.*
import com.batoulapps.adhan2.data.DateComponents
import kotlinx.datetime.*

class TodayPrayers {
    fun getPrayers(): PrayersModel {
        val now = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
        val coordinates = Coordinates(30.033333, 31.233334)
        val date = DateComponents(now.year, now.monthNumber, now.dayOfMonth)
        val params = CalculationMethod.KUWAIT.parameters
            .copy(madhab = Madhab.SHAFI, prayerAdjustments = PrayerAdjustments(fajr = 0))
        val prayerTimes = PrayerTimes(coordinates, date, params)
        val prayers = PrayersModel(
            "Cairo",
            prayerTimes.fajr.toLocalDateTime(TimeZone.currentSystemDefault()).time.toString(),
            prayerTimes.dhuhr.toLocalDateTime(TimeZone.currentSystemDefault()).time.toString(),
            prayerTimes.asr.toLocalDateTime(TimeZone.currentSystemDefault()).time.toString(),
            prayerTimes.maghrib.toLocalDateTime(TimeZone.currentSystemDefault()).time.toString(),
            prayerTimes.isha.toLocalDateTime(TimeZone.currentSystemDefault()).time.toString()
        )
        return prayers
    }
}
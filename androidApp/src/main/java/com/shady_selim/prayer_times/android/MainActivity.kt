package com.shady_selim.prayer_times.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shady_selim.prayer_times.PrayersModel
import com.shady_selim.prayer_times.TodayPrayers

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainView(TodayPrayers().getPrayers())
                }
            }
        }
    }
}

@Composable
fun MainView(prayers: PrayersModel) {
    Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp)) {
        Text(
            text = prayers.city,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.h2
        )
        Text(text = "Fajr: ${prayers.fajr}", style = MaterialTheme.typography.h3)
        Text(text = "Dhuhr: ${prayers.dhuhr}", style = MaterialTheme.typography.h3)
        Text(text = "Asr: ${prayers.asr}", style = MaterialTheme.typography.h3)
        Text(text = "Maghrib: ${prayers.maghrib}", style = MaterialTheme.typography.h3)
        Text(text = "Isha: ${prayers.isha}", style = MaterialTheme.typography.h3)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        MainView(TodayPrayers().getPrayers())
    }
}

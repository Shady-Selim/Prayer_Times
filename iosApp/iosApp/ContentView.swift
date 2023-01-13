import SwiftUI
import shared

struct ContentView: View {
    let prayers = TodayPrayers().getPrayers()
    HStack(alignment: .leading){
        Text(prayers.city)
        Text(prayers.fajr)
        Text(prayers.dhuhr)
        Text(prayers.asr)
        Text(prayers.maghrib)
        Text(prayers.isha)
    }
}

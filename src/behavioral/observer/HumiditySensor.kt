package behavioral.observer

class HumiditySensor(private val weatherApp: WeatherApp) {
    private val humidity = 0.0

    fun detectHumidity(humidity: Double) {
        if(this.humidity == humidity) {
            return
        }
        weatherApp.updateHumidity(humidity)
    }
}
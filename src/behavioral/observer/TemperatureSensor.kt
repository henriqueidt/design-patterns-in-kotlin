package behavioral.observer

class TemperatureSensor(private val weatherApp: WeatherApp) {
    private var temperature = 0.0

    fun detectTemperature(temperature: Double) {
        if(this.temperature == temperature) {
            return
        }
        this.temperature = temperature
        weatherApp.updateTemperature    (temperature)
    }
}
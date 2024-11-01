package behavioral.observer

class PressureSensor(private val weatherApp: WeatherApp) {
    private var pressure = 0.0

    fun detectPressure(pressure: Double) {
        if(this.pressure == pressure) {
            return
        }
        this.pressure = pressure
        weatherApp.updatePressure(pressure)
    }
}
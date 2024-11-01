package behavioral.observer

fun main() {
    val weatherApp = WeatherApp()
    val temperatureSensor = TemperatureSensor(weatherApp)
    val humiditySensor = HumiditySensor(weatherApp)
    val pressureSensor = PressureSensor(weatherApp)

    val phoneApp = Phone()
    val webApp = Desktop()

    weatherApp.registerObserver(phoneApp)
    weatherApp.registerObserver(webApp)

    temperatureSensor.detectTemperature(30.0)
    humiditySensor.detectHumidity(0.5)
    pressureSensor.detectPressure(1000.0)
}

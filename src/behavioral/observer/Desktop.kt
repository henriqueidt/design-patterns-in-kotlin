package behavioral.observer

class Desktop: Observer {
    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        println("Desktop: temperature = $temperature, humidity = $humidity, pressure = $pressure")
    }
}
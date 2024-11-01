package behavioral.observer

class Phone: Observer {
    override fun update(temperature: Double, humidity: Double, pressure: Double) {
        println("Phone: temperature = $temperature, humidity = $humidity, pressure = $pressure")
    }
}
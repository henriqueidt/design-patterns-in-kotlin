package behavioral.observer

interface Observer {
    fun update(temperature: Double, humidity: Double, pressure: Double)
}
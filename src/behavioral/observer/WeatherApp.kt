package behavioral.observer

class WeatherApp: Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature = 0.0
    private var humidity = 0.0
    private var pressure = 0.0

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    fun updateWeather(temperature: Double, humidity: Double, pressure: Double) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }

    fun updateTemperature(temperature: Double) {
        this.temperature = temperature
        notifyObservers()
    }

    fun updateHumidity(humidity: Double) {
        this.humidity = humidity
        notifyObservers()
    }

    fun updatePressure(pressure: Double) {
        this.pressure = pressure
        notifyObservers()
    }
}
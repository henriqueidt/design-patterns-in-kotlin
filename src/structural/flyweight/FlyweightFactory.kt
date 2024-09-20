package structural.flyweight

class FlyweightFactory {
    private val flyweights: MutableMap<String, Flyweight> = mutableMapOf()

    fun getFlyweight(key: String, base64Code: String): Flyweight {
        if (!flyweights.containsKey(key)) {
            flyweights[key] = Flyweight(base64Code)
        }
        return flyweights[key]!!
    }
}
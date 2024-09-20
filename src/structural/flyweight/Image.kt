package structural.flyweight

class Image(private val location: String, val data: Flyweight) {
    fun getLocation(): String {
        return location
    }

//    fun getData(): Flyweight {
//        return data
//    }
}
package structural.flyweight

class ImageWithBase64(private val location: String, val base64Code: String) {
    fun getLocation(): String {
        return location
    }

    fun getData(): String {
        return base64Code
    }
}
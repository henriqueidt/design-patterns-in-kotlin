package creational.abstractFactory

class Header(val firstArg: String, val secondArg: String?) {
    fun build(): String {
        return if (secondArg != null) {
            "$firstArg ->  $secondArg"
        } else {
            firstArg
        }
    }
}
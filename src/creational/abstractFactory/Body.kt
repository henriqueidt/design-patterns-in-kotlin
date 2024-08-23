package creational.abstractFactory

class Body(val firstArg: String) {
    fun build(): String {
        return firstArg
    }
}
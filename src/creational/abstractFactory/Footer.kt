package creational.abstractFactory

class Footer(val firstArg: String) {
    fun build(): String {
        return firstArg
    }
}
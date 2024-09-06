package structural.adapter

class LegacyInput(private val maxLength: Int) {
    private val validationMessage: String = "Please enter at least $maxLength characters"

    fun getvalidationMessage(): String {
        return validationMessage
    }
}
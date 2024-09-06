package structural.adapter

class NewInputAdapter(private val legacyInput: LegacyInput, isRequired: Boolean): NewInput(isRequired) {
    override fun getValidationMessage(): String? {
        return legacyInput.getvalidationMessage() + "\n" + super.getValidationMessage()
    }
}
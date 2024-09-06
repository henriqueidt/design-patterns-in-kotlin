package structural.adapter

open class NewInput(private val isRequired: Boolean) {
    open fun getValidationMessage(): String? {
        if (this.isRequired) {
            return "This field is required"
        } else  {
            return ""
        }
    }
}
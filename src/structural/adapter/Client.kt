package structural.adapter

fun main() {
    val legacyInput = LegacyInput(10)
    val adaptedInput = NewInputAdapter(legacyInput, true)
    val adaptedInput2 = NewInputAdapter(legacyInput, false)


    println(adaptedInput.getValidationMessage())
    println(adaptedInput2.getValidationMessage())
}
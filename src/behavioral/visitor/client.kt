package behavioral.visitor

fun main() {
    val book = Book(20.0, "The Lord of the Rings")
    val videogame = Videogame(50.0, "The Legend of Zelda")

    val taxCalculator = TaxCalculator()

    val cartItems = listOf(book, videogame)

    val priceBeforeTax = cartItems.sumOf { it.price }

    println("Total price before tax: $priceBeforeTax")

    cartItems.forEach { it.accept(taxCalculator) }

    val priceAfterTax = cartItems.sumOf { it.price }
    println("Total price after tax: $priceAfterTax")
}
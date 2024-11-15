package behavioral.strategy

interface PaymentStrategy {
    fun pay(amount: Double, cardNumber: String = "", portions: Int = 1)
}
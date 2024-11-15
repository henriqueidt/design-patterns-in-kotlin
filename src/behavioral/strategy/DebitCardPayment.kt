package behavioral.strategy

class DebitCardPayment: PaymentStrategy {
    override fun pay(amount: Double, cardNumber: String, portions: Int) {
        if(cardNumber.isEmpty()) {
            println("ERROR: No card number provided!")
            return
        }
        if(portions > 0) {
            println("ERROR: Debit card payment does not support portions!")
            return
        }

        println("Paying $amount with debit card $cardNumber")
    }
}
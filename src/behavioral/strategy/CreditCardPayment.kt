package behavioral.strategy

class CreditCardPayment: PaymentStrategy {
    override fun pay(amount: Double, cardNumber: String, portions: Int) {
        if(cardNumber.isEmpty()) {
            println("ERROR: No card number provided!")
            return
        }

        if(portions <= 0) {
            println("ERROR: Invalid number of portions!")
            return
        }

        val portionValue = amount / portions
        println("Paying $amount with credit card $cardNumber in $portions portions of $portionValue")
    }
}
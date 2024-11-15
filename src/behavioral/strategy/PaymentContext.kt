package behavioral.strategy

import behavioral.mediator.Payment

class PaymentContext(private var payment: PaymentStrategy) {
    fun setPaymentStrategy(payment: PaymentStrategy) {
        this.payment = payment
    }

    fun pay(amount: Double, cardNumber: String = "", portions: Int = 0) {
        payment.pay(amount, cardNumber, portions)
    }
}
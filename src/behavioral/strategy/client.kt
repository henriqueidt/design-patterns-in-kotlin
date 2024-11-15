package behavioral.strategy

fun main() {
    val paymentContext = PaymentContext(CreditCardPayment())
    paymentContext.pay(100.0, "1234-5678-9012-3456", 3)

    // invalid portions error
    paymentContext.pay(100.0, "1234-5678-9012-3456")

    // invalid card number error
    paymentContext.pay(100.0, "", 3)


    paymentContext.setPaymentStrategy(DebitCardPayment())
    paymentContext.pay(100.0, "1234-5678-9012-3456")

    // invalid card number error
    paymentContext.pay(100.0)

    // invalid portions error
    paymentContext.pay(100.0, "1234-5678-9012-3456", 3)
}
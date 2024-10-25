package behavioral.mediator

class Payment(mediator: Mediator): Component(mediator) {
    private var amount = 0

    fun pay() {
        amount = 0
        println("PAYMENT: Payment successful. Total price is now $amount")
        mediator.notify(this, "pay", amount)
    }

    override fun action(event: String, data: Any?) {
        when(event) {
            "add" -> {
                amount += data as Int
                println("PAYMENT: Adding $data to total amount. New amount is $amount")
            }

            "remove" -> {
                amount -= data as Int
                println("PAYMENT: Removing $data from total amount. New amount is $amount")
            }
        }
    }
}
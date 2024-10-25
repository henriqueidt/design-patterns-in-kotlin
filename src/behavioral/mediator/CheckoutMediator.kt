package behavioral.mediator

class CheckoutMediator: Mediator {
    private var cart: Cart? = null
    private var delivery: Delivery? = null
    private var payment: Payment? = null

    fun setComponents(cart: Cart, delivery: Delivery, payment: Payment) {
        this.cart = cart
        this.delivery = delivery
        this.payment = payment
    }

    override fun notify(sender: Component, event: String, data: Any?) {
        when(sender) {
            cart -> {
                if(event == "add" || event == "remove") {
                    payment?.action(event, data)
                    delivery?.action(event, data)

                }
            }
            payment -> {
                delivery?.action(event, null)
            }
            delivery -> {
                if(event == "deliver") {
                    println("Items delivered")
                    cart?.action("deliver", null)
                }
            }

        }
    }
}
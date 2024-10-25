package behavioral.mediator

fun main() {
    val mediator = CheckoutMediator()
    val cart = Cart(mediator)
    val payment = Payment(mediator)
    val delivery = Delivery(mediator)

    mediator.setComponents(cart, delivery, payment)

    val item1 = Item("Hamburger", 30)
    val item2 = Item("Coke", 5)

    cart.add(item1)
    cart.add(item2)

    payment.pay()

    delivery.deliver()

    println(cart.getItems())

    val item3 = Item("Fries", 10)
    cart.add(item3)

    delivery.deliver()

    payment.pay()

    delivery.deliver()


}
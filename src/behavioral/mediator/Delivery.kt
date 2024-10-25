package behavioral.mediator

class Delivery(mediator: Mediator): Component(mediator) {
    var isReadyToDeliver = false

    fun deliver() {
        if(isReadyToDeliver) {
            mediator.notify(this, "deliver")
            println("DELIVERY: Delivering order")
//            deliver()
        } else {
            println("DELIVERY: Cannot deliver, payment not received")
        }

    }

    override fun action(event: String, data: Any?) {
        if(event == "pay") {
            isReadyToDeliver = true
            println("DELIVERY: Payment received. Ready to deliver")
        }

        if(event == "add") {
            isReadyToDeliver = false
        }
    }
}
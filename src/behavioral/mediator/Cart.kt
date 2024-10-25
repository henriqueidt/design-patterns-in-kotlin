package behavioral.mediator

class Cart(mediator: Mediator): Component(mediator) {
    private val items = mutableListOf<Item>()

    fun add(item: Item) {
        items.add(item)
        println("CART: Adding ${item.name}, cost ${item.price}")
        mediator.notify(this, "add", item.price)
    }

    fun remove(item: Item) {
        items.remove(item)
        println("CART: Removing ${item.name}, cost ${item.price}")
        mediator.notify(this, "remove", item.price)
    }

    override fun action(event: String, data: Any?) {
        if (event == "deliver") {
            items.clear()
        }
    }

    fun getItems(): List<Item> {
        return items
    }
}
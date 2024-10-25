package behavioral.mediator

interface Mediator {
    fun notify(sender: Component, event: String, data: Any? = null)
}
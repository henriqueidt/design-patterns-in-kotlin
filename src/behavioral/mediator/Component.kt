package behavioral.mediator

abstract class Component(val mediator: Mediator) {
    abstract fun action(event: String, data: Any?)
}
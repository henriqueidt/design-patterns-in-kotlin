package behavioral.memento

interface Originator {
    fun save(): Memento
}
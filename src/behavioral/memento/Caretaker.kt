package behavioral.memento

interface Caretaker {
    var backup: Memento?

    fun save()

    fun restore()
}
package behavioral.command

interface Command {
    fun execute(): Boolean
    fun undo()
}
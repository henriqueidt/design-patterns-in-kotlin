package behavioral.command

import structural.facade.Account
import java.util.*

class TransactionManager {
    private val commands: MutableMap<String, Command> = mutableMapOf()

    fun executeCommand(command: Command) {
        command.execute()
        val commandId = UUID.randomUUID().toString()
        commands[commandId] = command
    }

    fun undoCommand(commandId: String) {
        val command = commands[commandId]
        if (command != null) {
            command.undo()
            commands.remove(commandId)
        }
    }
}
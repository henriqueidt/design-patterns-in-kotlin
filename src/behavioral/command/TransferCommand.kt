package behavioral.command

class TransferCommand(private val from: Account, private val to: Account, private val amount: Double) : Command {
    private val withdrawCommand = WithdrawCommand(from, amount)
    private val depositCommand = DepositCommand(to, amount)

    override fun execute(): Boolean {
        if(withdrawCommand.execute() ) {
            if(depositCommand.execute()) {
                println("Transfer successful")
                return true
            } else {
                println("Transfer failed")
                withdrawCommand.undo()
                return false
            }
        } else {
            println("Transfer failed")
            return false
        }
    }

    override fun undo() {
        depositCommand.undo()
        withdrawCommand.undo()
    }
}
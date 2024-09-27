package behavioral.command

class DepositCommand(private val account: Account, private val amount: Double) : Command {
    override fun execute(): Boolean {
        // simulate a failure in deposit
        if(amount == 300.0) {
            return false
        }
        account.deposit(amount)
        return true
    }

    override fun undo() {
        account.withdraw(amount)
    }
}
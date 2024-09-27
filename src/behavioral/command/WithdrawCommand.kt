package behavioral.command

class WithdrawCommand(private val account: Account, private val amount: Double) : Command {
    override fun execute(): Boolean {
        return account.withdraw(amount)
    }

    override fun undo() {
        account.deposit(amount)
    }
}
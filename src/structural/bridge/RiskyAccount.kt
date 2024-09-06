package structural.bridge

class RiskyAccount(var balance: Double): Account {
    override fun withdraw(amount: Double): OperationResult {
        if (this.balance < amount) {
            return OperationResult(false, "Insufficient funds")
        }
        val amountToWithdrawPercentage = amount / this.balance * 100

        if (amountToWithdrawPercentage > 50) {
            return OperationResult(false, "You can't withdraw more than 50% of your balance")
        }

        this.balance -= amount
        return OperationResult(true, "Withdrawal successful of: $amount. New balance is $balance")
    }

    override fun deposit(amount: Double): OperationResult {
        this.balance += amount
        return OperationResult(true, "Deposit successful of: $amount")
    }
}
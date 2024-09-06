package structural.bridge

class RegularAccount(var balance: Double): Account {
    override fun withdraw(amount: Double): OperationResult {
        if (this.balance < amount) {
            return OperationResult(false, "Insufficient funds")
        }
        this.balance -= amount
        return OperationResult(true, "Withdrawal successful of: $amount. New balance is $balance")
    }

    override fun deposit(amount: Double): OperationResult {
        this.balance += amount
        return OperationResult(true, "Deposit successful of: $amount")
    }
}
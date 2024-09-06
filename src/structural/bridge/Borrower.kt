package structural.bridge

class Borrower(private val account: Account) {
    fun getMoney(amount: Double): OperationResult {
        return account.withdraw(amount)
    }

    fun addMoney(amount: Double): OperationResult {
        return account.deposit(amount)
    }

    fun transferMoney(amount: Double, toAccount: Borrower): OperationResult {
        val withdrawResult = account.withdraw(amount)
        if (!withdrawResult.isSuccessfull) {
            return withdrawResult
        }
        return OperationResult(true, toAccount.addMoney(amount).message + " from: " + withdrawResult.message)

    }
}
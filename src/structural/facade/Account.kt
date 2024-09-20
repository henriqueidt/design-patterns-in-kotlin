package structural.facade

class Account(private val accountId: String) {
    private var balance: Double = 0.0

    fun getAccountId(): String {
        return accountId
    }

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }
        return false
    }

}
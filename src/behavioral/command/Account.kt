package behavioral.command

class Account(var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $amount, new balance is $balance")
    }

    fun withdraw(amount: Double): Boolean {
        if (amount > balance) {
            println("Insufficient funds")
            return false
        }
        balance -= amount
        println("Withdraw $amount, new balance is $balance")
        return true
    }
}
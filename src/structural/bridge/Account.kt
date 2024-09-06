package structural.bridge

interface Account {
    fun withdraw(amount: Double): OperationResult
    fun deposit(amount: Double): OperationResult
}
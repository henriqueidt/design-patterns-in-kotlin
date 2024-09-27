package behavioral.command

fun main() {
    val fromAccount = Account(1000.0)
    val toAccount = Account(500.0)
    val transactionManager = TransactionManager()

    val deposit = DepositCommand(fromAccount, 200.0)
    transactionManager.executeCommand(deposit)

    val withdraw = WithdrawCommand(fromAccount, 100.0)
    transactionManager.executeCommand(withdraw)

    val transfer = TransferCommand(fromAccount, toAccount, 3000.0)
    transactionManager.executeCommand(transfer)

    println("From account balance before failed transfer: ${fromAccount.balance}")
    val failedTransfer = TransferCommand(fromAccount, toAccount, 300.0)
    transactionManager.executeCommand(failedTransfer)
    println("From account balance after failed transfer: ${fromAccount.balance}")
}
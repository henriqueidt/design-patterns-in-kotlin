package structural.decorator

fun main() {
    val account = Account()
    account.applyMoney(100.0)

    val loggerDecorator = LoggerDecorator(account)
    loggerDecorator.withdrawAll()
}
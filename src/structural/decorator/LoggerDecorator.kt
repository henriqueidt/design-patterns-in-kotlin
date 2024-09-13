package structural.decorator

class LoggerDecorator(val bankEntity: BankEntity) : BankEntityDecorator(bankEntity) {

    override fun withdrawAll(): Double {
        println("Withdraw all")
        val amount = bankEntity.withdrawAll()
        println("Withdrawn $amount")
        Logger().log("Withdrawn $amount")
        return amount
    }
}
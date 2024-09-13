package structural.decorator

open class BankEntityDecorator(bankEntity: BankEntity): BankEntity {
    private var bankEntity: BankEntity? = null

    fun setBankEntity(bankEntity: BankEntity) {
        this.bankEntity = bankEntity
    }

    override fun getStatus(): String {
        return bankEntity!!.getStatus()
    }

    override fun setStatus(status: String) {
        bankEntity!!.setStatus(status)
    }

    override fun withdrawAll(): Double {
        return bankEntity!!.withdrawAll()
    }

    override fun applyMoney(amount: Double) {
        bankEntity!!.applyMoney(amount)
    }
}
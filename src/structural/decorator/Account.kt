package structural.decorator

class Account: BankEntity {
    private var status: String = "Created"
    private var balance: Double = 0.0

    override fun getStatus(): String {
        return status
    }

    override fun setStatus(status: String) {
        this.status = status
    }

    override fun withdrawAll(): Double {
        val amount = balance
        balance = 0.0
        return amount
    }

    override fun applyMoney(amount: Double) {
        balance += amount
    }
}
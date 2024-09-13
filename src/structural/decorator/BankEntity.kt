package structural.decorator

interface BankEntity {
    fun getStatus(): String
    fun setStatus(status: String)
    fun withdrawAll(): Double
    fun applyMoney(amount: Double)

}
package creational.builder

open class ReceiptBuilder() {
    val receipt: Receipt
    init {
        receipt = Receipt()
    }

    open fun setAmount(amount: Int): ReceiptBuilder {
        receipt.amount = amount
        return this
    }

    fun build(): Receipt {
        return receipt
    }
}
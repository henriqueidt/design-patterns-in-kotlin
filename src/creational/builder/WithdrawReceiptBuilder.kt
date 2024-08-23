package creational.builder

class WithdrawReceiptBuilder(): ReceiptBuilder() {
    init {
        receipt.type = "Withdraw"
    }

    fun setReceiver(receiver: String): WithdrawReceiptBuilder {
        receipt.receiver = receiver
        return this
    }
}
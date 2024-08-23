package creational.builder

class DepositReceiptBuilder() : ReceiptBuilder() {
    init {
        receipt.type = "deposit"
    }

    fun setSender(sender: String): DepositReceiptBuilder {
        receipt.sender = sender
        return this
    }
}
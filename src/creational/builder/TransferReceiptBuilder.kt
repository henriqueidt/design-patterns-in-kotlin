package creational.builder

class TransferReceiptBuilder(): ReceiptBuilder() {
    init {
        receipt.type = "Transfer"
    }

    fun setSender(sender: String): TransferReceiptBuilder {
        receipt.sender = sender
        return this
    }

    fun setReceiver(receiver: String): TransferReceiptBuilder {
        receipt.receiver = receiver
        return this
    }
}
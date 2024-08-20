package creational.factoryMethod

class TransferReceipt(amount: Number) : Receipt(amount, ReceiptType.TRANSFER_RECEIPT) {
    override fun generateReceipt(fromAccount: String?, toAccount: String?) {
        println("Generating transfer receipt of $$amount, from $fromAccount to $toAccount... ")
    }
}
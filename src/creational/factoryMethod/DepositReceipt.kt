package creational.factoryMethod

class DepositReceipt(amount: Number) : Receipt(amount, ReceiptType.DEPOSIT_RECEIPT) {
    override fun generateReceipt(fromAccount: String?, toAccount: String?) {
        println("Generating deposit receipt of $$amount to $toAccount... ")
    }
}
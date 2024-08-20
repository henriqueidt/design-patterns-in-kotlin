package creational.factoryMethod

class WithdrawReceipt(amount: Number) : Receipt(amount, ReceiptType.WITHDRAWAL_RECEIPT) {
    override fun generateReceipt(fromAccount: String?, toAccount: String?) {
        println("Generating withdrawal receipt of $$amount from $fromAccount... ")
    }
}
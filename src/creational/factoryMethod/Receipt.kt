package creational.factoryMethod

open class Receipt(
    val amount: Number,
    val type: ReceiptType = ReceiptType.GENERAL_RECEIPT
) {

    open fun generateReceipt(fromAccount: String?, toAccount: String?) {
        print("Generating receipt... ")
    }
}
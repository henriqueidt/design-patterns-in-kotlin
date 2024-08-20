package creational.factoryMethod

fun main() {
    val receiptFactory = ReceiptFactory()
    val depositReceipt = receiptFactory.createReceipt(1200, ReceiptType.DEPOSIT_RECEIPT)
    depositReceipt.generateReceipt(null, "12345")

    val transferReceipt = receiptFactory.createReceipt(2300, ReceiptType.TRANSFER_RECEIPT)
    transferReceipt.generateReceipt("12345", "67890")

    val withdrawalReceipt = receiptFactory.createReceipt(4000, ReceiptType.WITHDRAWAL_RECEIPT)
    withdrawalReceipt.generateReceipt("12345", null)

}

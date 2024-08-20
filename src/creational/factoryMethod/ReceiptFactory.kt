package creational.factoryMethod

class ReceiptFactory {
    fun createReceipt(amount: Number, receiptType: ReceiptType): Receipt {
        return when (receiptType) {
            ReceiptType.TRANSFER_RECEIPT -> TransferReceipt(amount)
            ReceiptType.WITHDRAWAL_RECEIPT -> WithdrawReceipt(amount)
            ReceiptType.DEPOSIT_RECEIPT -> DepositReceipt(amount)
            else -> Receipt(amount)
        }
    }
}
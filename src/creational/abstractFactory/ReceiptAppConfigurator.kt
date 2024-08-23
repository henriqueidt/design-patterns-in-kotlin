package creational.abstractFactory

class ReceiptAppConfigurator {
    fun configureReceipt(amount: String, from: String?, to: String?): ReceiptApp {
        if(from !== null && to !== null) {
            return ReceiptApp(TransferReceiptFactory())
        }
        if(from !== null) {
            return ReceiptApp(DepositReceiptFactory())
        }
        return ReceiptApp(WithdrawReceiptFactory())
    }
}
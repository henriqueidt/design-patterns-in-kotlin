package creational.builder

fun main() {
    val director = ReceiptDirector()
    val depositReceiptBuilder = DepositReceiptBuilder()
    val transferReceiptDirector = TransferReceiptBuilder()
    val withdrawReceiptBuilder = WithdrawReceiptBuilder()

    val depositReceipt = director.buildDepositReceipt(depositReceiptBuilder, "Alice", 100)
    val transferReceipt = director.buildTransferReceipt(transferReceiptDirector, "Alice", "Bob", 100)
    val withdrawReceipt = director.buildWithdrawReceipt(withdrawReceiptBuilder, "Bob", 100)

    println(depositReceipt.toString())
    println(transferReceipt.toString())
    println(withdrawReceipt.toString())
}
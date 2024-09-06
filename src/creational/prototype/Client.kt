package creational.prototype

fun main() {
    val depositReceipt = DepositReceipt(100, "Alice")

    val depositReceiptCopy = depositReceipt.cloneIt()

    depositReceiptCopy.updateSender("Charlie")
    depositReceiptCopy.updateValue(2000)

    println(depositReceipt)
    println(depositReceiptCopy)
}
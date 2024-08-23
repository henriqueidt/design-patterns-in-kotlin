package creational.abstractFactory

fun main() {
    val receiptAppConfigurator = ReceiptAppConfigurator()
    val from = "John"
    val to = "Doe"
    var value = "200"
    var receiptApp = receiptAppConfigurator.configureReceipt(value, from, to)
    val receipt = receiptApp.buildReceipt(value, from, to, true)
    println(receipt)


    value = "500"
    receiptApp = receiptAppConfigurator.configureReceipt(value, from, null)
    val receipt2 = receiptApp.buildReceipt(value, from, null, true)
    println(receipt2)

    value = "1000"
    receiptApp = receiptAppConfigurator.configureReceipt(value, null, to)
    val receipt3 = receiptApp.buildReceipt(value, null, to, true)
    println(receipt3)
}
package creational.abstractFactory

class ReceiptApp(val receiptFactory: ReceiptFactory) {
    fun buildReceipt(amount: String, from: String?, to: String?, isSuccess: Boolean): String {
        val header = receiptFactory.createHeader(from, to)
        val body = receiptFactory.createBody(amount)
        val footer = receiptFactory.createFooter(isSuccess)
        return """
            ${header.build()}
            ${body.build()}
            ${footer.build()}
        """.trimIndent()
    }
}
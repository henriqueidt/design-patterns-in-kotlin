package creational.abstractFactory

interface ReceiptFactory {
    fun createHeader(from: String?, to: String?): Header
    fun createBody(amount: String): Body
    fun createFooter(isSuccess: Boolean): Footer
}
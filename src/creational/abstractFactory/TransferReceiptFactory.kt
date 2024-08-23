package creational.abstractFactory

class TransferReceiptFactory: ReceiptFactory {
    override fun createHeader(from: String?, to: String?): Header {
        if(from === null || to === null) {
            throw IllegalArgumentException("Both from and to must be provided")
        }
        return Header(from, to)
    }

    override fun createBody(amount: String): Body {
        return Body(amount)
    }

    override fun createFooter(isSuccess: Boolean): Footer {
        val message = if (isSuccess) {
            "Transaction was successful"
        } else {
            "Transaction Failed!"
        }
        return Footer(message)
    }
}
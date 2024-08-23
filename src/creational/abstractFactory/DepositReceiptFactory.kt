package creational.abstractFactory

class DepositReceiptFactory: ReceiptFactory {
    override fun createHeader(from: String?, to: String?): Header {
        if (from == null) {
            throw IllegalArgumentException("from cannot be null")
        }
        return Header(
            from,
            secondArg = null
        )
    }

    override fun createBody(amount: String): Body {
        return Body(amount)
    }

    override fun createFooter(isSuccess: Boolean): Footer {
        val message = if (isSuccess) {
            "Deposit was successful"
        } else {
            "Deposit Failed!"
        }
        return Footer(message)
    }
}
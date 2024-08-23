package creational.abstractFactory

class WithdrawReceiptFactory: ReceiptFactory {
    override fun createHeader(from: String?, to: String?): Header {
        if(to != null) {
            return Header(to, null)
        }
        throw IllegalArgumentException("To cannot be null")
    }

    override fun createBody(amount: String): Body {
        return Body(amount)
    }

    override fun createFooter(isSuccess: Boolean): Footer {
        val message = if (isSuccess) {
            "Withdraw was successful"
        } else {
            "Withdraw Failed!"
        }
        return Footer(message)
    }
}
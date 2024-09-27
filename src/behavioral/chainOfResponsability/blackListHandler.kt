package behavioral.chainOfResponsability

class blackListHandler : Handler {
    private val blackList = listOf("Cersei Lannister", "Joker", "John Doe")
    private var nextHandler: Handler? = null

    override fun analyze(document: Document): Boolean? {
        if (blackList.contains(document.author)) {
            println("Application rejected: Author is in black list")
            return false;
        } else {
            return nextHandler?.analyze(document)
        }
    }

    fun setNextHandler(handler: Handler) {
        nextHandler = handler
    }
}
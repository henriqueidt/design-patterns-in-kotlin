package behavioral.chainOfResponsability

interface Handler {
    fun analyze(document: Document) : Boolean?
}
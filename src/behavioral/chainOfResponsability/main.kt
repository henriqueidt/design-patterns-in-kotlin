package behavioral.chainOfResponsability

import java.util.*

fun main() {
    val underAgeDocument = Document("Title", "Author", Date())
    val listedDocument = Document("Title", "Cersei Lannister", Date("12/12/1996"))
    val validDocument = Document("Title", "John Snow", Date("12/12/1996"))
    val blackListHandler = blackListHandler()
    val correctPIIHandler = correctPIIHandler()

    blackListHandler.setNextHandler(correctPIIHandler)

    if(blackListHandler.analyze(underAgeDocument) != false) {
        println("valid document 1")
    }
    if (blackListHandler.analyze(listedDocument) != false) {
        println("valid document 2")
    }
    if (blackListHandler.analyze(validDocument) != false) {
        println("valid document 3")
    }
}
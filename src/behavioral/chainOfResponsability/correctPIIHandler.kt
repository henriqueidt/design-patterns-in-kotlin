package behavioral.chainOfResponsability

import java.time.Period
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.util.*

class correctPIIHandler: Handler {
    private var nextHandler: Handler? = null

    override fun analyze(document: Document): Boolean? {
        if (!isAdult(document.dateOfBirth)) {
            println("Application rejected: Author is under 18")
            return false
        } else {
            return true
//            return nextHandler?.analyze(document)
        }
    }

    fun setNextHandler(handler: Handler) {
        nextHandler = handler
    }

    fun isAdult(dateOfBirth: Date): Boolean {
        val today = Date()
        val age = Period.between(dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()).get(ChronoUnit.YEARS)
        return age >= 18
    }
}
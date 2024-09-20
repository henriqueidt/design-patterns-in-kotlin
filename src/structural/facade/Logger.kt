package structural.facade

class Logger {
    fun log(message: String) {
        val date = java.time.LocalDateTime.now()
        println("{\n\t\"message\": \"$message\",\n\t\"date\": \"$date\"\n}")

    }
}
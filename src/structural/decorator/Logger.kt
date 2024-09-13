package structural.decorator

import java.util.Date

class Logger {
    fun log(message: String) {
        println("Log: $message" + Date().toString())
    }
}
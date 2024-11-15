package behavioral.tempateMethod

import java.io.File

abstract class DataParser {
    fun parseTransformData(filePath: String) {
        val data = readFile(filePath)
        val parsedData = parseData(data)
        val transformedData = transformData(parsedData)
        saveData(transformedData)
    }

    fun readFile(filePath: String): String {
        println("Reading data from $filePath")
        return File(filePath).readText()
    }

    abstract fun parseData(data: String): Map<String, Any>
    abstract fun transformData(parsedData: Map<String, Any>): Map<String, Any>

    fun saveData(data: Map<String, Any>) {
        println("Saving data: $data")
    }
}
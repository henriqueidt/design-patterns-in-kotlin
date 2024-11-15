package behavioral.tempateMethod

class CSVParser: DataParser() {
    override fun parseData(data: String): Map<String, Any> {
        // Split data separating by newline characters
        val lines = data.lines()
        // first() -> will return nil if there are no items in first line
        // [0]     -> will crash app if there are no items in first line
        val header = lines.first().split(",")
        //  val header = lines[0].split(",")

        val data = lines.drop(1).map { it.split(",") }
        return mapOf("header" to header, "data" to data)
    }

    override fun transformData(parsedData: Map<String, Any>): Map<String, Any> {
        val header = parsedData["header"] as List<String>
        val data = parsedData["data"] as List<List<String>>

        val transformedData = data.map { row -> header.zip(row).toMap() }
        return mapOf("header" to header, "data" to transformedData)
    }
}
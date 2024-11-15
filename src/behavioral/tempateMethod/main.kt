package behavioral.tempateMethod

fun main() {
    val csvParser = CSVParser()
    csvParser.parseTransformData("src/behavioral/tempateMethod/data.csv")

    val jsonParser = JSONParser()
    jsonParser.parseTransformData("src/behavioral/tempateMethod/data.json")

}
package behavioral.tempateMethod

import org.json.JSONObject
import java.util.*


class JSONParser: DataParser() {
    override fun parseData(data: String): Map<String, Any> {
        val jsonObj = JSONObject(data)
        return jsonObj.toMap()
    }

    override fun transformData(parsedData: Map<String, Any>): Map<String, Any> {
        return parsedData.mapKeys { it.key.uppercase(Locale.getDefault()) }
    }
}
package creational.builder

class Receipt {
    var sender: String = ""
    var receiver: String = ""
    var amount: Int = 0
    var type: String = ""

    override fun toString(): String {
        return "Receipt(sender='$sender', receiver='$receiver', amount=$amount, type='$type')"
    }
}
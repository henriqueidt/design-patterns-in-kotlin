package creational.prototype

class DepositReceipt(var value: Int, var sender: String): Cloneable, Receipt {
    override fun cloneIt(): Receipt {
        val copy: DepositReceipt = super.clone() as DepositReceipt
        copy.value = this.value
        copy.sender = this.sender
        return copy
    }

    override fun updateSender(sender: String) {
        this.sender = sender
    }

    override fun updateValue(value: Int) {
        this.value = value
    }

    override fun toString(): String {
        return "DepositReceipt(value=$value, sender='$sender')"
    }
}
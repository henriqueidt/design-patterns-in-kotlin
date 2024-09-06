package creational.prototype

class TransferReceipt(var value: Int, var sender: String, var receiver: String): Cloneable, Receipt {
    override fun cloneIt(): Receipt {
        val copy: TransferReceipt = super.clone() as TransferReceipt
        copy.value = this.value
        copy.sender = this.sender
        copy.receiver = this.receiver
        return copy
    }

    override fun updateSender(sender: String) {
        this.sender = sender
    }

    override fun updateReceiver(receiver: String) {
        this.receiver = receiver
    }

    override fun updateValue(value: Int) {
        this.value = value
    }

    override fun toString(): String {
        return "TransferReceipt(value=$value, sender='$sender', receiver='$receiver')"
    }
}
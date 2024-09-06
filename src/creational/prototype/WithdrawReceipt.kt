package creational.prototype

class WithdrawReceipt(var value: Int, var receiver: String): Cloneable, Receipt {
    override fun cloneIt(): Receipt {
        val copy: WithdrawReceipt = super.clone() as WithdrawReceipt
        copy.value = this.value
        copy.receiver = this.receiver
        return copy
    }

    override fun updateReceiver(receiver: String) {
        this.receiver = receiver
    }

    override fun updateValue(value: Int) {
        this.value = value
    }

    override fun toString(): String {
        return "WithdrawReceipt(value=$value, receiver='$receiver')"
    }
}
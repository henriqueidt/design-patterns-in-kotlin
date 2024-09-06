package creational.prototype

import creational.abstractFactory.Header

interface Receipt {
    fun cloneIt(): Receipt
    fun updateSender(sender: String) {}
    fun updateReceiver(receiver: String) {}
    fun updateValue(value: Int) {}
}
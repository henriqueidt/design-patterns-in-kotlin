package creational.builder;

public class ReceiptDirector {
    fun buildTransferReceipt(builder: TransferReceiptBuilder, sender: String, receiver: String, amount: Int): Receipt {
        builder.setSender(sender)
            .setReceiver(receiver)
            .setAmount(amount)
        return builder.build()
    }

    fun buildDepositReceipt(builder: DepositReceiptBuilder, sender: String, amount: Int): Receipt {
        builder.setSender(sender)
            .setAmount(amount)
        return builder.build()
    }

    fun buildWithdrawReceipt(builder: WithdrawReceiptBuilder, receiver: String, amount: Int): Receipt {
        builder.setReceiver(receiver)
            .setAmount(amount)
        return builder.build()
    }
}

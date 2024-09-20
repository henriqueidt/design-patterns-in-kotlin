package structural.facade

class BankFacade(private val accountManagerFacade: AccountManagerFacade) {
    private val logger = Logger()

    fun addAccount(): String {
        return accountManagerFacade.addAccount()
    }

    fun deposit(accountId: String, amount: Double): Boolean {
        val isDeposited = accountManagerFacade.deposit(accountId, amount)
        if (isDeposited) {
            logger.log("Deposited $amount to account $accountId")
        } else {
            logger.log("Failed to deposit $amount to account $accountId")
        }
        return isDeposited
    }

    fun transferMoney(fromAccountId: String, toAccountId: String, amount: Double): Boolean {
        val isWithdrawn = accountManagerFacade.withdraw(fromAccountId, amount)
        if (isWithdrawn) {
            val isDeposited = accountManagerFacade.deposit(toAccountId, amount)
            if (isDeposited) {
                logger.log("Transferred $amount from account $fromAccountId to account $toAccountId")
                return true
            } else {
                logger.log("Failed to transfer $amount from account $fromAccountId to account $toAccountId")
            }
        } else {
            logger.log("Failed to transfer $amount from account $fromAccountId to account $toAccountId")
        }
        return false
    }


}
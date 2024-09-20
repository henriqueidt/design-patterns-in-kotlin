package structural.facade

fun main() {
    val accountManagerFacade = AccountManagerFacade()
    val bankFacade = BankFacade(accountManagerFacade)
    val fromAccountId = bankFacade.addAccount()
    val toAccountId = bankFacade.addAccount()

    bankFacade.deposit(fromAccountId, 100.0)
    bankFacade.transferMoney(fromAccountId, toAccountId, 50.0)
    bankFacade.transferMoney(fromAccountId, toAccountId, 700.0)
}
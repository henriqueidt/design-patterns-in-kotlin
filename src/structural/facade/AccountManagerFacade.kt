package structural.facade

import java.util.UUID

class AccountManagerFacade {
    private val accounts: MutableMap<String, Account> = mutableMapOf()

    fun addAccount(): String {
        val accountId = UUID.randomUUID().toString()
        val account = Account(accountId)
        accounts[accountId] = account
        return accountId
    }

    fun getAccount(accountId: String): Account? {
        return accounts[accountId]
    }

    fun deposit(accountId: String, amount: Double): Boolean {
        val account = accounts[accountId]
        if (account != null) {
            account.deposit(amount)
            return true
        }
        return false
    }

    fun withdraw(accountId: String, amount: Double): Boolean {
        val account = accounts[accountId]
        if (account != null) {
            return account.withdraw(amount)
        }
        return false
    }
}
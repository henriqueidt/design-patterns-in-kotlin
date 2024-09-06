package structural.bridge

fun getMoney(borrower: Borrower, amount: Double) {
    println(borrower.getMoney(amount).message)
}

fun addMoney(borrower: Borrower, amount: Double) {
    println(borrower.addMoney(amount).message)
}

fun transferMoney(from: Borrower, to: Borrower, amount: Double) {
    println(from.transferMoney(amount, to).message)
}

fun main() {
    val regularAccount = RegularAccount(100.0)
    val riskyAccount = RiskyAccount(100.0)

    val regularBorrower = Borrower(regularAccount)
    val riskyBorrower = Borrower(riskyAccount)


    // Regular should successfully withdraw
    getMoney(regularBorrower, 50.0)
    // Risky should fail withdraw if amount is greater than 50% of balance
    getMoney(riskyBorrower, 51.0)

    // Risky should successfully transfer less than 50% of balance
    transferMoney(riskyBorrower, regularBorrower, 49.0)
    // Risky should fail transfer if amount is greater than 50% of balance
    transferMoney(riskyBorrower, regularBorrower, 51.0)
}
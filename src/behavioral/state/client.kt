package behavioral.state

fun main() {
    // Lock account
    val user1 = User("john@doe.com", "1234")
    user1.login("1312312")
    user1.login("73647832")
    user1.login("123123")
    user1.login("4466")

    println("------------------------------------------")

    //    Login and logout
    val user2 = User("maria@doe.com", "1234")
    user2.login("1234")
    user2.login("1234")
    user2.logout()
    user2.logout()
}
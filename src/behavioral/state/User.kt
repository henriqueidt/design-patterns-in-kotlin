package behavioral.state

class User(var email: String, var password: String) {
    private var state: UserState = GuestState.getInstance()
    private var failedLoginAttempts = 0

    fun login(pass: String) {
        if(pass != this.password) {
            failedLoginAttempts++
        } else {
            failedLoginAttempts = 0
        }

        state = state.login(this.failedLoginAttempts)
    }

    fun logout() {
        state = state.logout()
    }
}
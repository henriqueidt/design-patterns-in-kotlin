package behavioral.state

interface UserState {
    fun login(failedAttempts: Int?): UserState
    fun logout(): UserState
}
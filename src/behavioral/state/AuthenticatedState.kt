package behavioral.state

class AuthenticatedState: UserState {
    companion object {
        @Volatile
        private var instance: AuthenticatedState? = null

        fun getInstance(): AuthenticatedState {
            return instance ?: synchronized(this) {
                instance ?: AuthenticatedState().also { instance = it }
            }
        }
    }

    override fun login(failedAttempts: Int?): UserState {
        println("User is already logged in")
        return this
    }

    override fun logout(): UserState {
        println("User logging out")
        return GuestState.getInstance()
    }
}
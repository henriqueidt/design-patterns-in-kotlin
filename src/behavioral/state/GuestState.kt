package behavioral.state

class GuestState: UserState {
    companion object {
        @Volatile
        private var instance: GuestState? = null

        fun getInstance(): GuestState {
            return instance ?: synchronized(this) {
                instance ?: GuestState().also { instance = it }
            }
        }
    }

    override fun login(failedAttempts: Int?): UserState {
        if(failedAttempts != null && failedAttempts > 0 && failedAttempts < 3) {
            println("Invalid password, failed attempts: $failedAttempts")
            return this
        }
        if(failedAttempts != null && failedAttempts >= 3) {
            println("Maximum invalid attempts, changing to LOCKED STATE")
            return LockedState.getInstance()
        }

        println("User logging in, changing to AUTHENTICATED STATE")
        return AuthenticatedState.getInstance()
    }

    override fun logout(): GuestState {
        println("User is not logged in")
        return this
    }
}
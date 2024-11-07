package behavioral.state

class LockedState: UserState {
    companion object {
        @Volatile
        private var instance: LockedState? = null

        fun getInstance(): LockedState {
            return instance ?: synchronized(this) {
                instance ?: LockedState().also { instance = it }
            }
        }
    }

    override fun login(failedAttempts: Int?): UserState {
        println("User is locked")
        return this
    }

    override fun logout(): UserState {
        println("User is locked")
        return this
    }
}
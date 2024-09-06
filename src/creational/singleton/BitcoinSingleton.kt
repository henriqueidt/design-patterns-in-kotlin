package creational.singleton

class BitcoinSingleton {
    private var history: String = ""

    companion object {
        @Volatile
        private var instance: BitcoinSingleton? = null

        fun getInstance(): BitcoinSingleton {
            return instance ?: synchronized(this) {
                instance ?: BitcoinSingleton().also { instance = it }
            }
        }
    }

    fun transfer(id: String) {
        this.history += "-$id"
    }

    fun getHistory(): String {
        return this.history
    }
}
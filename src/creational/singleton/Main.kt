package creational.singleton


    fun main() {
        val bitcoinSingleton = BitcoinSingleton.getInstance()

        bitcoinSingleton.transfer("alice")
        bitcoinSingleton.transfer("ned")
        bitcoinSingleton.transfer("yan")

        client1()
        client2()

        println(bitcoinSingleton.getHistory())
    }

    fun client1() {
        val bitcoinSingleton = BitcoinSingleton.getInstance()

        bitcoinSingleton.transfer("john")
        bitcoinSingleton.transfer("bob")
        bitcoinSingleton.transfer("peter")
    }

    fun client2() {
        val bitcoinSingleton = BitcoinSingleton.getInstance()

        bitcoinSingleton.transfer("paul")
        bitcoinSingleton.transfer("jack")
        bitcoinSingleton.transfer("lock")

    }

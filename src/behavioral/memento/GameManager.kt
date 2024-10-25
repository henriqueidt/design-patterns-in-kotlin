package behavioral.memento

class GameManager(): Caretaker {
    override var backup: Memento? = null
    var gameSave: GameSave? = null

    override fun save() {
        backup = gameSave?.save()
    }

    override fun restore() {
        backup?.restore()
    }

    fun startGame() {
        gameSave = GameSave()
        save()
    }

    fun fight() {
        if(Math.random() > 0.5) {
            gameSave?.gainScore(10)
        } else {
            gameSave?.takeDamage(10)
        }

        if(gameSave?.score!! >= 30) {
            println("Level up!")
            gameSave?.levelUp()
            gameSave?.healthUp()
            save()
        }

        if(gameSave?.life!! <= 0) {
            println("You died!")
            restore()
            gameSave!!.score = 0
        }

        display()
    }

    fun display() {
        println("Level: ${gameSave?.level}, Score: ${gameSave?.score}, Life: ${gameSave?.life}")
    }
}
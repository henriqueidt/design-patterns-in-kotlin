package behavioral.memento

class GameSaveMemento(private val gameSave: GameSave, private val level: Int, private val score: Int, private val life: Int): Memento {
    override fun restore() {
        gameSave.level = level
        gameSave.score = score
        gameSave.life = life
    }
}
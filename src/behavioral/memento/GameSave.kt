package behavioral.memento

class GameSave: Originator {

    var level: Int = 0
        public set(value) {
            field = value
        }
    var score: Int = 0
    var life: Int = 20;

    fun levelUp() {
        level++
    }

    fun takeDamage(damage: Int) {
        life -= damage
    }

    fun gainScore(points: Int) {
        score += points
    }

    fun healthUp() {
        life += 10
    }


    override fun save(): Memento {
        return GameSaveMemento(this,level, score, life)
    }
}
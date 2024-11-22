package behavioral.visitor

class TaxCalculator: Visitor {
    override fun visit(book: Book) {
        book.price *= 1.1
    }

    override fun visit(videogame: Videogame) {
        videogame.price *= 1.2
    }

    override fun visit(cloth: Cloth) {
        cloth.price *= 1.3
    }
}
package structural.composite

fun main() {
    val store = Store("market store")
    val clothesDepartment = StoreDepartment("clothes department")
    val jacketsShelf = StoreShelf("jackets shelf")

    val blueJacket = StoreProduct(100.0, "blue jacket")
    val redJacket = StoreProduct(150.0, "red jacket")

    jacketsShelf.add(blueJacket)
    jacketsShelf.add(redJacket)
    clothesDepartment.add(jacketsShelf)

    store.add(clothesDepartment)

    println("Store price: ${store.returnPrice()}")
    println("Clothes department price: ${clothesDepartment.returnPrice()}")
    println("Store: ${store.toString()}")

    store.remove(clothesDepartment)
    println("Store: ${store.toString()}")
    println("Jackets: ${jacketsShelf.toString()}")
}
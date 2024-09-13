package structural.composite

abstract class StoreComponentBase(val price: Double, val name: String): StoreComponent {
    override fun returnPrice(): Double {
        return this.price
    }
}
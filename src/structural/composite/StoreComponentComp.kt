package structural.composite

open class StoreComponentComp(val name: String): StoreComponent {
    private val storeComponents = mutableListOf<StoreComponent>()

    fun add(storeComponent: StoreComponent) {
        storeComponents.add(storeComponent)
    }

    fun getStoreComponents(): List<StoreComponent> {
        return storeComponents
    }

    fun remove(storeComponent: StoreComponent) {
        if(storeComponent is StoreComponentComp) {
            val componentsToRemove = storeComponent.getStoreComponents().toList()
            componentsToRemove.forEach { component ->
                storeComponent.remove(component)
            }
        }
        storeComponents.remove(storeComponent)
    }

    override fun returnPrice(): Double {
        var price = 0.0
        for (storeComponent in storeComponents) {
            price += storeComponent.returnPrice()
        }
        return price
    }

    override fun toString(): String {
        return this.name + " " + this.returnPrice() + "\n" + storeComponents.joinToString("\n")
    }
}
package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class BubbasFrozenCustard : Attraction() {
    override val address: String = "1276 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOXc969OQra29XZ4x1D1xuo9RAo5YnckCsK1OQB=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.4
    override val name: String = "Bubba's Frozen Custard"
    override val tags: Set<String> = sortedSetOf("hot food", "cold food", "bubbas", "bubbas frozen custard", "bubba's", "bubba's frozen custard", "frozen custard", "custard", "ice cream", "food", "restaurant", "burgers", "milkshakes", "grill", "sweets", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class BuffaloWildWingsPewaukee : Attraction() {
    override val address: String = "1273 Capitol Dr Suite A, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipN5RDrqvrN3hCMRlln7yzLmSgOzhu5ylYy7uZIt=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.9
    override val name: String = "Buffalo Wild Wings Pewaukee"
    override val tags: Set<String> = sortedSetOf("food", "bww", "bw3s", "b3w", "buffalo wild wings", "wings", "hot food", "chicken wings", "sports", "restaurant", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

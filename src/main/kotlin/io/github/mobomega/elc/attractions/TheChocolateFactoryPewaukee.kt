package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class TheChocolateFactoryPewaukee : Attraction() {
    override val address: String = "161 W Wisconsin Ave #1b, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipMJq5CsKZXy3aBVsr_5p-5B9Kk7euUPrlIfbqmT=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "The Chocolate Factory Pewaukee"
    override val tags: Set<String> = sortedSetOf("cold food", "ice cream", "sweets", "confectionery", "sandwiches", "subs", "sub sandwich", "sub sandwiches", "sandwich", "restaurant", "food", "pewaukee", "pewaukee lakefront", "wi", "wisconsin", "53072")
}

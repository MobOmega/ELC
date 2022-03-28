package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class WCTC : Attraction() {
    override val address: String = "800 Main St, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipM1gpySpVjP1iWzvBnOoFvZRRnzAFnxgyQl4spd=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.1
    override val name: String = "Waukesha County Technical College"
    override val tags: Set<String> = sortedSetOf("college", "technical college", "wctc", "waukesha county", "waukesha county college", "waukesha county technical college", "main", "main st", "main street", "pewaukee", "waukesha", "wi", "wisconsin", "53072")
}

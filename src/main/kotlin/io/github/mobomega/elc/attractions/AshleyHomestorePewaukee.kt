package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class AshleyHomestorePewaukee : Attraction() {
    override val address: String = "1230 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNVUl4TOrOS192cVOaKndDXr5YILIAnd-BRZVkC=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.9
    override val name: String = "Ashley Homestore Pewaukee"
    override val tags: Set<String> = sortedSetOf("homestore", "home", "store", "furniture", "furniture store", "ashley", "ashley homestore", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

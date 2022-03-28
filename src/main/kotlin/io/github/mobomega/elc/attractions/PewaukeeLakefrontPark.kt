package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PewaukeeLakefrontPark : Attraction() {
    override val address: String = "222 W. Wisconsin Avenue, Pewaukee, WI 53072"
    override val image: String = "https://pewaukee.org/wp-content/uploads/2017/05/great-atmosphere.jpg"
    override val source: String = "pewaukee.org"
    override val stars: Double = 4.6
    override val name: String = "Pewaukee Lakefront Park"
    override val tags: Set<String> = sortedSetOf("fun", "pewaukee lakefront park", "pewaukee", "wisconsin", "waukesha county", "53072", "lakefront", "beach", "park", "wi")
}
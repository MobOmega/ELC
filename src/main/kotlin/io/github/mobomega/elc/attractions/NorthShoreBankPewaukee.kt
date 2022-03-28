package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class NorthShoreBankPewaukee : Attraction() {
    override val address: String = "120 W Wisconsin Ave, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPxTpBntE-QTIMv1wge9eXldSBWuQggR02EY_eQ=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.8
    override val name: String = "North Shore Bank Pewaukee"
    override val tags: Set<String> = sortedSetOf("north shore", "north shore bank", "bank", "finance", "financial", "w wisconsin ave", "w wisconsin", "west wisconsin ave", "west wisconsin avenue", "w wisconsin avenue", "wisconsin ave", "wisconsin avenue", "pewaukee", "wi", "wisconsin", "53072")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SimplyCinnamonBakery : Attraction() {
    override val address: String = "115 Oakton Ave, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNWo6Wc5Pt-D66kzS1CumDYDLjcFO47luSIBrFY=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.5
    override val name: String = "Simply Cinnamon Bakery"
    override val tags: Set<String> = sortedSetOf("food", "bakery", "simply cinnamon", "simply cinnamon bakery", "baked goods", "sweets", "oakton", "oakton ave", "oakton avenue", "pewaukee", "wi", "wisconsin", "53072")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class MoesSouthwestGrillPewaukee : Attraction() {
    override val address: String = "1350 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPY5ZHN4R5ey30VX325kOvycscZAsrLXcQoIzMK=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.0
    override val name: String = "Moe's Southwest Grill Pewaukee"
    override val tags: Set<String> = sortedSetOf("moes", "moe's", "moe's southwest grill", "moes southwest grill", "food", "restaurant", "grill", "hot food", "mexican food", "mexican", "mexican cuisine", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

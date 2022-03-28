package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class AdventureRockBrookfield : Attraction() {
    override val address: String = "21250 W Capitol Dr, Brookfield, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPhlYUfT2XhjEj55mL4zBTM62qkL4mW6fcuselr=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.8
    override val name: String = "Adventure Rock Brookfield"
    override val tags: Set<String> = sortedSetOf("fun", "adventure rock", "rock climbing", "capitol", "capitol dr", "capitol drive", "brookfield", "wi", "wisconsin", "53072")
}

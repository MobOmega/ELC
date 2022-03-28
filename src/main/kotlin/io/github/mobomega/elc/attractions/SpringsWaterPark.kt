package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SpringsWaterPark : Attraction() {
    override val address: String = "2810 Golf Rd, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipMcyDI64Vk8uMPtkbtIWOBMocAGY5zf_BAp9ZqC=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.3
    override val name: String = "Springs Water Park"
    override val tags: Set<String> = sortedSetOf("ingleside", "ingleside hotel", "springs", "country springs", "water", "water park", "fun", "golf rd", "golf road", "pewaukee", "wi", "wisconsin", "53072")
}

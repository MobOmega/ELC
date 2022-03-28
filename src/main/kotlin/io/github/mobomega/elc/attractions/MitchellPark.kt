package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class MitchellPark : Attraction() {
    override val address: String = "19900 River Rd, Brookfield, WI 53045"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPCT_1LSNKgAhaxIik8R87YIN9B55pj3XuioMyM=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "Mitchell Park"
    override val tags: Set<String> = sortedSetOf("fun", "river rd", "river road", "river", "pond", "wetlands", "park", "mitchell park", "brookfield", "wi", "wisconsin", "53045")
}

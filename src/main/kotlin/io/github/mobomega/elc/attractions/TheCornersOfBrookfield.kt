package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class TheCornersOfBrookfield : Attraction() {
    override val address: String = "20111 W Bluemound Rd, Brookfield, WI 53045"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPj9wH1XoPO4Kx8XQQyiGiEz8iIgJSEtzpjCFbd=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.4
    override val name: String = "The Corners of Brookfield"
    override val tags: Set<String> = sortedSetOf("mall", "brookfield", "outdoor", "shopping", "shopping mall", "outdoor mall", "corners", "fun", "outdoor shopping mall", "collection", "bluemound", "bluemound rd", "bluemound road", "w bluemound", "w bluemound rd", "w bluemound road", "west bluemound", "west bluemound rd", "west bluemound road", "wi", "wisconsin", "53045")
}

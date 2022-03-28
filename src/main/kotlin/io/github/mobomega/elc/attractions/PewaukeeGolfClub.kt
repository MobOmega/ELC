package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PewaukeeGolfClub : Attraction() {
    override val address: String = "N12 W26506, Golf Rd, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPnNJn5FN3l80FVwCQkS1qwxyRIMIeTsYeAjkcT=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.7
    override val name: String = "Pewaukee Golf Club"
    override val tags: Set<String> = sortedSetOf("fun", "sports", "sport", "golf", "golf rd", "golf road", "golf club", "club", "country club", "golfing", "golf course", "pewaukee golf club", "pewaukee golf course", "course", "pewaukee", "wi", "wisconsin", "53072")
}

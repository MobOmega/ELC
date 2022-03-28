package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class ChickFilAPewaukee : Attraction() {
    override val address: String = "1454 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://static.cfacdn.com/photos/restaurants/03859/large.jpg"
    override val source: String = "chick-fil-a.com"
    override val stars: Double = 4.4
    override val name: String = "Chick-fil-A Pewaukee"
    override val tags: Set<String> = sortedSetOf("capitol dr", "capitol", "capitol drive", "restaurant", "food", "chicken", "chick-fil-a", "chick fil a", "pewaukee", "wi", "wisconsin", "53072")
}

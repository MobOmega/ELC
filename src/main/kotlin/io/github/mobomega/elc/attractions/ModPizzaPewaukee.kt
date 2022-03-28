package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class ModPizzaPewaukee : Attraction() {
    override val address: String = "1450 Capitol Dr Suite A, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOcbop4mVPp8kLnYqHjjJsMDQqF59DqB9JC2NMY=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.5
    override val name: String = "Mod Pizza Pewaukee"
    override val tags: Set<String> = sortedSetOf("pizzeria", "pizza", "hot food", "mod", "mod pizza", "food", "capitol", "capitol dr", "capitol drive", "pewaukee", "wisconsin", "wi", "53072")
}

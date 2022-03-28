package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class TeriyakiMadnessPewaukee : Attraction() {
    override val address: String = "1390 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipP15959-9Eg61bKFqvmKfggYuYpuHFZK1UVocfk=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.1
    override val name: String = "Teriyaki Madness Pewaukee"
    override val tags: Set<String> = sortedSetOf("food", "restaurant", "asian", "asian fusion", "asian cuisine", "asian fusion restaurant", "capitol", "capitol dr", "capitol drive", "hot food", "pewaukee", "wi", "wisconsin", "53072")
}

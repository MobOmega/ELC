package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class NoodlesAndCompanyPewaukee : Attraction() {
    override val address: String = "1390 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipMdQgZIFLmraTE17HdXpKGOslRxWetKoS7gGwKg=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.2
    override val name: String = "Noodles and Company Pewaukee"
    override val tags: Set<String> = sortedSetOf("hot food", "noodles", "food", "restaurant", "noodles and company", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

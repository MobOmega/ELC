package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class MenardsPewaukee : Attraction() {
    override val address: String = "1357 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipN1Q-v1qRgtDdtd4s4lEHLb7hoyQWo-Tbg6CZgO=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.2
    override val name: String = "Menards Pewaukee"
    override val tags: Set<String> = sortedSetOf("home improvement", "home improvement store", "store", "pewaukee", "menards", "capitol", "capitol dr", "capitol drive", "wi", "wisconsin", "53072")
}

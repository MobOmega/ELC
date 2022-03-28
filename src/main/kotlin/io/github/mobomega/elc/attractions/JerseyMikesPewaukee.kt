package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class JerseyMikesPewaukee : Attraction() {
    override val address: String = "1450 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPzbF_RsMVfNSaicOhCV2rP_9Rm0H06KFcPA-oJ=w900-h1482-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.4
    override val name: String = "Jersey Mike's Subs Pewaukee"
    override val tags: Set<String> = sortedSetOf("food", "subs", "sub sandwich", "sub sandwiches", "sandwich", "sandwiches", "jersey mike's", "jersey mikes", "pewaukee", "capitol", "capitol dr", "capitol drive", "wi", "wisconsin", "53072")
}

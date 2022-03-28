package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class AldiPewaukee : Attraction() {
    override val address: String = "1201 George Towne Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipMQvBj_6ImhmXT9rpkToP404Dn7Y632JGoOzixB=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.5
    override val name: String = "ALDI Pewaukee"
    override val tags: Set<String> = sortedSetOf("aldi", "aldi's", "food", "market", "store", "supermarket", "grocery", "grocery store", "pewaukee", "george towne", "george towne dr", "george towne drive", "wi", "wisconsin", "53072")
}

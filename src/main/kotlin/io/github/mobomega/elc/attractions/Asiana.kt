package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class Asiana : Attraction() {
    override val address: String = "1198 George Towne Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPd__t4PfnIxL7141zOJhqoljnD_NmdLwgmcnlf=w384-h360-p-k-no-pi0-ya230.69023-ro0-fo100"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.2
    override val name: String = "Asiana Fine Dining Restaurant"
    override val tags: Set<String> = sortedSetOf("hot food", "food", "asiana", "asian food", "panasian", "panasian food", "hibachi", "steak", "steakhouse", "restaurant", "george towne", "george towne dr", "george towne drive", "pewaukee", "wi", "wisconsin", "53072")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class FourStarFamilyRestaurantAndSportsPub : Attraction() {
    override val address: String = "120 Simmons Ave, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNcsVqUsf2npUXV2ymeKWSazWfxMgEclakGZTZE=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.2
    override val name: String = "Four Star Family Restaurant & Sports Pub"
    override val tags: Set<String> = sortedSetOf("four star", "four star family restaurant", "food", "hot food", "breakfast", "restaurant", "family restaurant", "pub", "sports", "sports pub", "simmons", "simmons ave", "simmons avenue", "pewaukee", "wi", "wisconsin", "53072")
}

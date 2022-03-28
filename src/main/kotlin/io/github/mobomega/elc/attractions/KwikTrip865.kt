package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class KwikTrip865 : Attraction() {
    override val address: String = "130 Dynex Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOfnr6Qf9BJ9yLoEgeiP1OLbE6lqlh3GmMNCjjR=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "Kwik Trip #865"
    override val tags: Set<String> = sortedSetOf("food", "fuel", "kwik trip", "gas", "gasoline", "gas station", )
}

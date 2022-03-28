package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class ParkAvenuePizza : Attraction() {
    override val address: String = "121 Park Ave, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNx1a1_scVTB62du7OI-0CLglp5xcJJ_HTcr4B_=w384-h360-p-k-no-pi-10-ya141.6754-ro0-fo100"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.3
    override val name: String = "Park Avenue Pizza Company"
    override val tags: Set<String> = sortedSetOf("park avenue", "park ave", "park avenue pizza", "pizza", "park ave pizza", "park ave pizza company", "park avenue pizza company", "hot food", "pizzeria", "food", "restaurant", "pewaukee", "wi", "wisconsin", "53072")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class CostcoWholesalePewaukee : Attraction() {
    override val address: String = "443 Pewaukee Rd, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipO1zhziA3nS3PPc8T_q1jfIiUX8wrRrojNBCLD_=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "Costco Wholesale Pewaukee"
    override val tags: Set<String> = sortedSetOf("fuel", "food", "gasoline", "gas station", "warehouse", "warehouse store", "gas", "costco", "wholesale", "costco wholesale", "store", "pewaukee", "pewaukee rd", "pewaukee road", "wi", "wisconsin", "53072")
}

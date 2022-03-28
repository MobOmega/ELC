package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class WalmartPewaukee : Attraction() {
    override val address: String = "411 Pewaukee Rd, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPEgwKi61QUjeINAmOgJ5yNH_Ls1lgb9lTYTuaG=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.9
    override val name: String = "Walmart Pewaukee"
    override val tags: Set<String> = sortedSetOf("food", "walmart", "department store", "store", "pewaukee", "pewaukee rd", "pewaukee road", "wi", "wisconsin, 53072")
}

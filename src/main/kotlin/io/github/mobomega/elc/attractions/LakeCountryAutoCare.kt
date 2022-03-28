package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class LakeCountryAutoCare : Attraction() {
    override val address: String = "449 Hickory St, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPSCnHN1SIc_ZN9ekpdWYAdul-3SvLDKx0EUlmh=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.5
    override val name: String = "Lake Country Auto Care"
    override val tags: Set<String> = sortedSetOf("lake country", "lake country auto", "lake country auto care", "auto", "auto care", "auto repair", "auto care shop", "auto repair shop", "car repair", "car care", "cars", "hickory", "hickory st", "hickory street", "pewaukee", "wi", "wisconsin", "53072")
}

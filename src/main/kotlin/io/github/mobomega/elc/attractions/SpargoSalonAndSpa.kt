package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SpargoSalonAndSpa : Attraction() {
    override val address: String = "1001 Cecelia Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNJBbz8Lw3QhlF9jkDTDVRPwyaaBLyI9CsT3HJ8=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.8
    override val name: String = "Spargo Salon & Spa"
    override val tags: Set<String> = sortedSetOf("spa", "salon", "spargo", "salon & spa", "salon and spa", "beauty salon", "spargo salon & spa", "spargo salon and spa", "cecelia", "cecelia dr", "cecelia drive", "pewaukee", "wi", "wisconsin", "53072")
}

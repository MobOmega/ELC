package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class WaukeshaCountyAirport : Attraction() {
    override val address: String = "2525 Aviation Dr, Waukesha, WI 53188"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipPRfm5FOG7K8Yf2hNrZBr5otb2MdM7Qx3s82opA=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.9
    override val name: String = "Waukesha County Airport"
    override val tags: Set<String> = sortedSetOf("airport", "waukesha", "waukesha county", "airplanes", "travel", "destination", "county airport", "waukesha county airport", "airplanes", "port", "aviation", "aviation dr", "aviation drive", "wi", "wisconsin", "53188")
}

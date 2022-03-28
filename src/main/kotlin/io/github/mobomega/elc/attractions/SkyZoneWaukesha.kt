package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SkyZoneWaukesha : Attraction() {
    override val address: String = "W229 N, 1420 Westwood Dr, Waukesha, WI 53186"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipODCZYaAsNoJguXMWeL0ALnT3WRWdoQXkVIDCHN=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.3
    override val name: String = "Sky Zone Trampoline Park Waukesha"
    override val tags: Set<String> = sortedSetOf("fun", "amusement", "amusement center", "trampoline", "trampoline park", "waukesha", "westwood", "westwood dr", "westwood drive", "wi", "wisconsin", "53186")
}

package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SussexBowl : Attraction() {
    override val address: String = "N64W24576 Main St, Sussex, WI 53089-2602"
    override val image: String = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/19/09/a6/30/mesas-para-servirse-algo.jpg?w=1400&h=-1&s=1"
    override val source: String = "tripadvisor.com"
    override val stars: Double = 3.5
    override val name: String = "Sussex Bowl"
    override val tags: Set<String> = sortedSetOf("fun", "bowling", "bowl", "bowling alley", "sussex", "sussex bowl", "wisconsin", "wi", "waukesha", "53089", "53089-2602")
}

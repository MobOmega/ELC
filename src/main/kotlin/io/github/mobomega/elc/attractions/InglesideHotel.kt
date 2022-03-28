package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class InglesideHotel : Attraction() {
    override val address: String = "2810 Golf Rd, Waukesha, WI 53072-5449"
    override val image: String = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1d/21/c2/6a/the-ingleside-hotel.jpg?w=1400&h=-1&s=1"
    override val source: String = "tripadvisor.com"
    override val stars: Double = 4.0
    override val name: String = "The Ingleside Hotel"
    override val tags: Set<String> = sortedSetOf("hotel", "the ingleside hotel", "waukesha", "golf road", "pool", "beach", "wi", "wisconsin", "53072", "53072-5449")
}

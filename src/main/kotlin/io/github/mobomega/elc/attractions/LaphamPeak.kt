package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class LaphamPeak : Attraction() {
    override val address: String = "Kettle Moraine State Forest, Delafield, WI 53018"
    override val image: String = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1d/dd/9e/cd/scenic-view-from-the.jpg?w=1400&h=-1&s=1"
    override val source: String = "tripadvisor.com"
    override val stars: Double = 4.8
    override val name: String = "Lapham Peak"
    override val tags: Set<String> = sortedSetOf("lapham peak", "peak", "waukesha county", "forest", "kettle moraine", "delafield", "wisconsin", "wi", "53018", "view")
}

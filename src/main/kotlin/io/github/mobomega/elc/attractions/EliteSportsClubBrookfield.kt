package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class EliteSportsClubBrookfield : Attraction() {
    override val address: String = "13825 W Burleigh Rd, Brookfield, WI 53005"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNl23Fm06BW45OkilC6zAnaS73_p-r3XKs7gmou=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.0
    override val name: String = "Elite Sports Club-Brookfield"
    override val tags: Set<String> = sortedSetOf("sports", "sports club", "elite", "elite sports club", "elite club", "gym", "tennis", "fitness", "fitness center", "exercise", "exercize", "burleigh", "burleigh rd", "burleigh road", "w burleigh", "west burleigh", "w burleigh rd", "w burleigh road", "west burleigh rd", "west burleigh road", "brookfield", "wi", "wisconsin", "53005")
}

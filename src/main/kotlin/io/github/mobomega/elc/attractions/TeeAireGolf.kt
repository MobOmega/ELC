package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class TeeAireGolf : Attraction() {
    override val address: String = "21700 Gumina Rd, Brookfield, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNHPobg6DFBPVEE_CWzb0ihMWudrcqloutL9qd9=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "Tee-Aire Golf"
    override val tags: Set<String> = sortedSetOf("tee-aire", "tee", "tee aire", "tee-aire golf", "tee aire golf", "golf", "golf driving range", "driving range", "mini golf", "minigolf", "mini-golf", "gumina", "gumina rd", "gumina road", "brookfield", "wi", "wisconsin", "53072")
}

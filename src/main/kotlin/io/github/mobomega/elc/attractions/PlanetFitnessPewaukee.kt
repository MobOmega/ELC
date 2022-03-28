package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PlanetFitnessPewaukee : Attraction() {
    override val address: String = "1275 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOa754641_0z0of3TBigmvwQKplgn2FhrwZVdz2=w384-h360-p-k-no-pi0-ya214.15569-ro0-fo100"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.6
    override val name: String = "Planet Fitness Pewaukee"
    override val tags: Set<String> = sortedSetOf("fitness", "planet fitness", "exercise", "exercize", "gym", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

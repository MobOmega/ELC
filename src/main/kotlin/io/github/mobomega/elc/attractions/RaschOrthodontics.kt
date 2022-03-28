package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class RaschOrthodontics : Attraction() {
    override val address: String = "Suite B N35W23770, Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNiLsY7VkEFb3ZL8VtW4is8MtppDcMlu6GTSnnJ=w384-h360-p-k-no-pi-20-ya38.67916-ro0-fo100"
    override val source: String = "maps.google.com"
    override val stars: Double = 5.0
    override val name: String = "Rasch Orthodontics"
    override val tags: Set<String> = sortedSetOf("clinic", "orthodontics", "rasch", "rasch orthodontics", "teeth", "braces", "pewaukee", "capitol", "capitol dr", "capitol drive", "wi", "wisconsin", "53072")
}

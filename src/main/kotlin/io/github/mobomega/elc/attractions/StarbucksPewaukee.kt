package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class StarbucksPewaukee : Attraction() {
    override val address: String = "1440 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOVAVC66Kqkh1LfgC5492EfDuGi9WUsZbAKqypn=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.3
    override val name: String = "Starbucks Pewaukee"
    override val tags: Set<String> = sortedSetOf("coffee", "breakfast", "coffee shop", "cafe", "food", "tea", "latte", "starbucks", "starbucks coffee", "capitol", "capitol dr", "capitol drive", "hot food", "pewaukee", "wi", "wisconsin", "53072")
}

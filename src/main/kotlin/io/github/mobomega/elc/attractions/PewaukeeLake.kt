package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PewaukeeLake : Attraction() {
    override val address: String = "Pewaukee Lake, Pewaukee, WI 53072"
    override val image: String = "https://pewaukee.org/wp-content/uploads/2017/05/p-024-pewaukee-lake-waukesha-co-wisconsin-bill-lang.jpg"
    override val source: String = "pewaukee.org"
    override val stars: Double = 4.6
    override val name: String = "Pewaukee Lake"
    override val tags: Set<String> = sortedSetOf("pewaukee", "wisconsin", "waukesha county", "53072", "lake", "wi")
}

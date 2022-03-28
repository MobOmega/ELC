package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class SummitCreditUnionPewaukee : Attraction() {
    override val address: String = "1468 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipNlm4dd-0kM3-QqXYUttCPKUyvTfzivMPuuoavr=w426-h240-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.7
    override val name: String = "Summit Credit Union Pewaukee"
    override val tags: Set<String> = sortedSetOf("summit", "summit credit union", "credit union", "finance", "financial", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}

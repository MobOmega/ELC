package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class ChaseBankPewaukee : Attraction() {
    override val address: String = "110 Oakton Ave, Pewaukee WI 53072"
    override val image: String = "https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=-cMETCS4Hw4pIg6nFmlwvA&cb_client=search.gws-prod.gps&yaw=213.93054&pitch=0&thumbfov=100&w=384&h=360"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.1
    override val name: String = "Chase Bank Pewaukee"
    override val tags: Set<String> = sortedSetOf("chase", "chase bank", "bank", "finance", "financial", "oakton", "oakton ave", "oakton avenue", "pewaukee", "wi", "wisconsin", "53072")
}

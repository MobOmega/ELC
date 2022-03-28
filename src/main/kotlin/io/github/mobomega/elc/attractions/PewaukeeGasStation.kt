package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PewaukeeGasStation : Attraction() {
    override val address: String = "1194 Capitol Dr, Pewaukee, WI 53072"
    override val image: String = "https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=thBrGSsLcT8jN4xxpnez9w&cb_client=search.gws-prod.gps&yaw=281.18103&pitch=0&thumbfov=100&w=384&h=360"
    override val source: String = "maps.google.com"
    override val stars: Double = 4.1
    override val name: String = "Pewaukee Gas Station"
    override val tags: Set<String> = sortedSetOf("gasoline station", "pewaukee gasoline", "pewaukee gasoline station", "gas", "gas station", "pewaukee gas", "pewaukee gas station", "gasoline", "fuel", "food", "station", "capitol", "capitol dr", "capitol drive", "pewaukee", "wi", "wisconsin", "53072")
}
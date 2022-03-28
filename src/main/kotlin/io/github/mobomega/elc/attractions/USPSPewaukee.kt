package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class USPSPewaukee : Attraction() {
    override val address: String = "140 Simmons Ave, Pewaukee, WI 53072"
    override val image: String = "https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=gNcGlyG8XDyPBOTR6PZOew&cb_client=search.gws-prod.gps&yaw=95.21305&pitch=0&thumbfov=100&w=384&h=360"
    override val source: String = "maps.google.com"
    override val stars: Double = 2.6
    override val name: String = "United States Postal Service Pewaukee"
    override val tags: Set<String> = sortedSetOf("usps", "united states", "postal service", "united states postal service", "us postal service", "postal", "post", "mail", "simmons", "simmons ave", "simmons avenue", "pewaukee", "post office", "pewaukee post office", "wi", "wisconsin", "53072")
}

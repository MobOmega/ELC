package io.github.mobomega.elc.attractions

import io.github.mobomega.elc.Attraction

class PewaukeePediatrics : Attraction() {
    override val address: String = "1215 George Towne Dr, Pewaukee, WI 53072"
    override val image: String = "https://lh5.googleusercontent.com/p/AF1QipOgkDj73XegKTfvs6gIdnuqjfG3qypC67XLdCnG=w384-h360-p-k-no"
    override val source: String = "maps.google.com"
    override val stars: Double = 3.8
    override val name: String = "Pewaukee Pediatrics-Children's Wisconsin"
    override val tags: Set<String> = sortedSetOf("clinic", "children's", "childrens", "hospital", "childrens hospital", "children's hospital", "child hospital", "health", "healthcare", "pediatrics", "pediatric", "pediatric hospital", "pewaukee pediatric", "pewaukee pediatrics", "children's wisconsin", "childrens wisconsin", "george towne", "george towne dr", "george towne drive", "pewaukee", "wi", "wisconsin", "53072")
}

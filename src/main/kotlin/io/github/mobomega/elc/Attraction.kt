package io.github.mobomega.elc

abstract class Attraction {
    open val address: String = ""
    open val image: String = ""
    open val source: String = ""
    open val stars: Double = 0.0
    open val name: String = ""
    open val tags: Set<String> = setOf("")

}
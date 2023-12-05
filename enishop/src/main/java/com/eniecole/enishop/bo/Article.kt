package com.eniecole.enishop.bo

import java.time.LocalDate
import java.time.LocalDateTime

data class Article(
    val id:Long = 0L,
    var titre: String,
    var prix: Double,
    var description: String,
    var urlImage : String,
    val dateSortie: LocalDate
)

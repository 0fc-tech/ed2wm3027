package com.eniecole.enishop.bo

import android.os.Build
import android.os.Parcelable
import androidx.annotation.RequiresApi
import kotlinx.parcelize.Parcelize
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

@Parcelize
data class Article(
    val id:Long = 0L,
    var titre: String,
    var prix: Double,
    var description: String,
    var urlImage : String,
    val dateSortie: LocalDate
) : Parcelable {

    @RequiresApi(Build.VERSION_CODES.O)
    fun afficheDate() = dateSortie.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
}











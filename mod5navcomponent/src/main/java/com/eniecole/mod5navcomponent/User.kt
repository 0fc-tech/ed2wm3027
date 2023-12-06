package com.eniecole.mod5navcomponent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    val prenom:String,
    val nom: String,
    val age: Int,
    val email:String
): Parcelable
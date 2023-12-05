package com.eniecole.mod3kotlin

import java.time.LocalDateTime


fun LocalDateTime.afficherHM() {
    println("${this.hour}h${this.minute}m")
}
fun main() {
    LocalDateTime.now().afficherHM()
    var elvis : String? = "Hello World"
    val taille = elvis?.length ?: -1

    var tailleN :Int? = null
    if(elvis != null){
        tailleN = elvis.length
    }else{
        tailleN = -1
    }

    val collectionCouleurs = mutableListOf<String>()
    collectionCouleurs += "Jaune"
    collectionCouleurs.add("Vert")
    collectionCouleurs.add("Bleu")
    collectionCouleurs.add("Orange")
    collectionCouleurs.add("Rouge")

    val nbRouge = collectionCouleurs.filter { rouge->
        rouge == "Rouge" ||
        rouge == "rouge"
    }.count()
    val sumCharacters = collectionCouleurs.sumOf {
        it.length
    }
    println(sumCharacters)

}
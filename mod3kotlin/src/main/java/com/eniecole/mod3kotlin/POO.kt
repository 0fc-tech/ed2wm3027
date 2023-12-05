package com.eniecole.mod3kotlin

fun main() {
    val patBalK = Personne("Patrick","Balkany")
    patBalK.direBonjour()
}

open class Personne(
    val prenom :String,
    val nom: String){
    open fun direBonjour()= println("Bonjour $prenom $nom")
}

class Enfant(
    val nom2:String,
    val prenom2: String) : Personne(prenom2,nom2){

    override fun direBonjour() {
        println("Bonjour Enfant $prenom2 $nom2")
    }
}
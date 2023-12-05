package com.eniecole.mod3kotlin

fun main() {
    val age = 19
    val message = if(age>=18)"Majeur" else "Mineur"
    println(message)

    val age2 = 1
    when(age2){
        1,2 -> println("C'est un bébé")
        in 1..18 -> println("Mineur")
        is Int -> println("C'est un entier")
        else -> println("Majeur")
    }
    val pays = arrayOf("Bleu","Blanc","Rouge")

    for (p in pays) println(p)
}
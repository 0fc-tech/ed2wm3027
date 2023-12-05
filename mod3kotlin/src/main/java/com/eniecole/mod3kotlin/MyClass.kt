package com.eniecole.mod3kotlin

var test = "Hello"
fun main() {
    val message by lazy { "Ma valeur : $test" }
    println(test)
    println("World")
    val valeur = 10
    //valeur = 234

    var valeur2 = 40
    valeur2 = 765
    test = "mlsdfs"
    println(message)
    var mot :String? = null
    println(mot)
    val monUser = "jeanpaul";
}
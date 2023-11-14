package com.example.corrcc1kotlin_2023
//le aussi le "type récepteur" (ou "Receiver Type", en anglais),
fun String.removeFirstLastChar(): String
        = this.substring(1, this.length - 1)
fun String.DernierEnMaj(): String
        = this.substring(0, this.length - 1) +this.substring(this.length-2,this.length-1).uppercase()
fun MutableList<String>.shift(){
    if(!this.isEmpty()){
        this.removeAt(0)
    }
    else throw NoSuchElementException("Collection vide")
}
fun Any?.toString(): String {
    if (this == null) return "---"
    // après la vérification nulle, 'ceci' est converti automatiquement en un type non nul, donc le toString() ci-dessous
    // se résout en fonction membre de la classe Any
    return toString()
}
fun String.acronym(): String {
    var s: String = ""
    var mots = this.split(" ")

    for (mot: String in mots)
        if (mot.isNotEmpty())
            s += mot[0];

    return s.uppercase();
}
fun MutableList<String>.shiftt(){
    if(!this.isEmpty()){
        this.removeAt(0)
    }
    else throw NoSuchElementException("Collection vide")
}

fun main() {

    val myString= "Hello Everyone"

    val result = myString.removeFirstLastChar()
    println("First character is: $result")
    val result1 = myString.DernierEnMaj()
    println("First character is: $result1")
    val result2 = myString.acronym()
    println("First character is: $result2")
    /*val listName: MutableList<String> = mutableListOf("Noé","Jean","Carole","Rose","Luc")
    println(listName)
    listName.shift()
    println(listName)

    var x:String? =null
    println(x.toString())
    */
    val listName: MutableList<String> = mutableListOf("Noé","Jean","Carole","Rose","Luc")
    println(listName)
    listName.shiftt()
    println(listName)
}

//this  reprsente l'objet de la classe pourlaquelle
//on souhaite créer l'extension
//cet objet s'appelle un receiver


package com.example.corrcc1kotlin_2023

import java.util.Collections

fun Array<Int>.swap(i : Int, j:Int)
{
    if (i >= this.size || j >=this.size)
        throw Exception("indices incorrects")
   var tmp=this[i]
    this[i]=this[j]
    this[j]=tmp


}
fun main () {


    var T :Array<Int>  = arrayOf(1,3,5,7,9)
    println("avant swap")
    for (e in T){
        println(e)
    }

    T.swap(4,2)
    println("après swap")
for (e in T){
    println(e)
}

}
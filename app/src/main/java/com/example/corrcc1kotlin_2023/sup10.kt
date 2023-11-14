package com.example.corrcc1kotlin_2023

fun sup10(lst: ArrayList<Int>): ArrayList<Int> {
    val lstNew = ArrayList<Int>()
    for (nbr in lst) {
        if (nbr > 10) {
            lstNew.add(nbr)
        }
    }
    return lstNew
}
fun sup10bis(lst: ArrayList<Int>)= lst.filter { it>10 }


package com.example.corrcc1kotlin_2023
data class User(var nom: String, var age: Int)

fun main()
{

    val lambda0: (Int,Int) -> Int ={ a,b -> a +b}
    val lambda1: (Int) -> Int ={ a -> a * a}
    val lambda2: (String,String) -> String = { a , b -> a + b }
    val lambda3: (Int)-> Unit = {a->print(a)}
    //val lambda4: String.(Int) -> String = {this + it}
    val concat:(Int,Int)->String={n1,n2->"$n1$n2"}

println(concat(4,6))
    println(lambda1(5))


    val u1=User("Sabir", 20)
    val u2= User("Tahiri", 18)
    val u3 =User("Lamrabet", 35)

    val users = listOf(u1,u2,u3)
/*

    var maxAge=0
    for (elt in users)
    {
        if (elt.age>maxAge){
            maxAge=elt.age
        }
    }
     println(" Age max =" + max)
    */

    //ou tout simplement
    println(users.maxBy { it.age } )
    //it mot réservé faisant réference au paramètre
// Get the older user
    //object User
   /* var u=users.maxBy { it.age }
    println(u.age)
*/
    // User("oc@gmail.com", 35)
// Get the younger user
    println(users.minBy { it.age } )     // User("hello@gmail.com", 18)
// Is all users >= 20 ?
    println(users.all { it.age >= 20 } )   // false
//println(users.all { User::age >= 20 })
// Is any user >= 35 ?
    println(users.any { it.age >= 35 })     // true
// How many user are >= 20 ?
    println(users.count{it.age>= 20})      // 2
// Find the first user who is >= 20
    println(users.find{ it.age >= 20 })
    // Find the list of user that have age greater than or equal  20
    println(users.filter{ it.age >= 20 })


// User(nom="Sabir", age=20)
    println(users.map{it.nom})

    //affiche une collection du champs demandé
    // [Sabir, Tahiri, Lamrabet]
    //pour println(users.map{it.nom})
    //et
    // [18, 20, 35]
    //pour println(users.map{it.age})
}
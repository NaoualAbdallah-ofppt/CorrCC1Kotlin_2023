package com.example.corrcc1kotlin_2023

import java.util.Date
import java.util.GregorianCalendar

interface Iparcours
{
    fun getDiplome():Boolean
}
//une classe data ne peut être open, abstract,
//sealed ou inner. son constructeur doit
//au moins avoir un paramètre
//les paramètres doivent être val ou var
//obligatoirement
//donc pour qu'on puisse hériter de cette
//classe on va la rendre open et écrire notre
// méthode toString() manuellement
 open  class Personne (var cin:String, var nom:String, var age:Int)
//open ne marche pas avec data
{
   override fun toString()="Cin=$cin,nom=$cin et age=$age"
}
class Examen (var code:String)
{
    lateinit var  intitule:String
    var NumeroParcours:Int=0


    constructor( code:String, intitule:String ,NumeroParcours:Int):this(code)
            {
        this.intitule=intitule
        this.NumeroParcours=NumeroParcours

    }
}
class Score (var exam:Examen,var dateE:Date )
{


    var score:Int =0
        get()=field
        set(value){
            if (value<0 || value>1000)
                throw Exception("erreur score")
            field=value}
    constructor( dateE:Date,exam :Examen, score:Int):this(exam,dateE)
    {
       /* if (score<0 || score>1000)
            throw Exception("erreur score")*/
        this.score=score
    }
}
class Stagiaire (cin:String,nom:String,age:Int) :Personne(cin,nom,age),Iparcours
{ var NumInscription:Int=0
    var DateInscription:Date?=null
    var LstScores :MutableList <Score> =mutableListOf<Score>()

    fun getCategorie()=when
    {

        age>26->{"CA"}
        age <22->{"CC"}
        else ->{"CB"}
    }
    fun addScore(S:Score)
    {
        LstScores.add(S)

    }
    fun meilleurScore():Int{
        var max:Int=0
        for (i in 0 ..LstScores.count()-1)
        {
            if (max<LstScores[i].score){
                max =LstScores[i].score
            }
        }
        return max
    }
    override fun getDiplome():Boolean{

        var cpt=0
        for(s in LstScores)
        {
            if (s.score>700)
                cpt++

        }
        if (cpt>3)
            return  true
        else
            return  false
    }



    // fun meilleurScore()=LstScores.maxBy { it.score }

  /*  override fun getDiplome()
            =if(LstScores.count{it.score>= 700} >3) true else false

   */
}
fun main()
{
    var S = Stagiaire("A500500","Sabir",30)
   var x = GregorianCalendar()
    S.NumInscription=1234
    S.DateInscription = x.time

    var E1= Examen("E1","exam1",1)
    var E2= Examen("E2","exam2",1)
    var E3= Examen("E3","exam3",2)
    var E4= Examen("E4","exam4",1)
    var E5= Examen("E5","exam5",2)

    var S1 = Score(x.time,E1,800)
    var S2 = Score(x.time,E2,900)
    var S3 = Score(x.time,E3,490)
    var S4 = Score(x.time,E4,980)
   // var S5 = Score(x.time,E5,950)

    S.addScore(S1)
    S.addScore(S2)
    S.addScore(S3)
    S.addScore(S4)
    //on peut ajouter un objet anonyme sans le créer avant
    S.addScore(Score(x.time,E5,950))
    if (S.getDiplome()) {
        print("Ce stagiaire a réussi")
        print(". Son meilleur score est :"+ S.meilleurScore())
    }
    else
        print("Ce stagiaire n'a pas réussi")

}
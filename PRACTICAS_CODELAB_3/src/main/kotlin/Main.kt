package org.example

fun main() {
    //usa variables anulables
   val actorfavorito = null
    println(actorfavorito)

    var favoriteactor: String?="sandra oh"
    println(favoriteactor)
    favoriteactor = null
    println(favoriteactor)

    //int
    var number: Int? = 10
    println(number)

    number = null
    println(number)

    //procesa variables anulables
    var actorfavorite : String = "sandra oh"
    println(actorfavorite.length)



    var actorpreferido : String? = "sandra oh"
    println(actorpreferido?.length)

    var actorpreferido1 : String? = null
    println(actorpreferido1?.length)

    var actorpreferido2 : String? = "sandra oh"
    println(actorpreferido2!!.length)




    var actorfavorito1:String? = "sandra oh"

    if (actorfavorito1 != null){
        println("The number of characters in your favorite actor's name is ${actorfavorito1.length}.")
    }


    var actorfavorito2:String? = null

    if (actorfavorito2 != null){
        println("The number of characters in your favorite actor's name is ${actorfavorito2.length}.")
    }else{
        println("You didn't input a name.")
    }

    var actorfavorito3:String? = "sandra oh"

    val lengthofname =
    if (actorfavorito3 != null){
        actorfavorito3.length
    }else{
        0
    }
    println("The number of characters in your favorite actor's name is $lengthofname.")

    val actorfavorito4:String?="sandra oh"
    val lengthofname1 = actorfavorito4?.length ?:0
    println("The number of characters in your favorite actor's name is $lengthofname1.")
}
package org.example

fun main() {
    val number = 1
    1==1
    println(1==1)
    println(1<1)
    println(1>1)
    println(1<=1)
    println(1>=1)
    println(1!=1)

    //condiciones
    val colordetrafico = "green"
    if (colordetrafico == "red") {
        println("stop")
    } else if (colordetrafico=="yellow") {
    println("slow")
    }else if (colordetrafico == "green"){
       println("go")
    }else{
        println("color de trafico invalido")
    }
//when
    val colortrafico = "yellow"
    when(colortrafico){
        "red" -> println("stop")
        "yellow"-> println("slow")
        "green"-> println("go")
        else -> println("color de luz de trafico invalido")
    }

    val x = 3
    when(x){
        2,3,5,7-> println("x is a prime number between 1 and 10.")
        3-> println("x is a prime number between 1 and 10.")
        5-> println("x is a prime number between 1 and 10.")
        7-> println("x is a prime number between 1 and 10.")
        else-> println("x isn't a prime number between 1 and 10.")
    }

    val y = 3
    when(y){
        2,3,5,7-> println("y is a prime number between 1 and 10.")
        else-> println("y isn't a prime number between 1 and 10.")
    }

    val z = 4
    when(z){
        2,3,5,7-> println("z is a prime number between 1 and 10.")
        in 1..10-> println("z is a number between 1 and 10, but not a prime number.")
        else-> println("z isn't a prime number between 1 and 10.")
    }

    val a: Any = 20
    when(a){
        2,3,5,7-> println("a is a prime number between 1 and 10.")
        in 1..10-> println("a is a number between 1 and 10, but not a prime number.")
        is Int-> println("a is an integer number, but not between 1 and 10.")
        else-> println("a isn't an integer number.")
    }

    val colortrafico1 = "amber"
    when(colortrafico1){
        "red" -> println("stop")
        "yellow", "amber"-> println("slow")
        "green"-> println("go")
        else -> println("color de luz de trafico invalido")
    }



    //como usar if/else y when

    val colortrafico2 ="black"
    val message=

    if (colortrafico2 =="red")"stop"


    else if (colortrafico2 == "yellow")"slow"

    else if (colortrafico2 =="green")"go"

    else "color invalido de trafico"

    println(message)




    val colortrafico3 = "amber"
    val message2=
    when(colortrafico3){
        "red" -> println("stop")
        "yellow", "amber"-> println("slow")
        "green"-> println("go")
        else -> println("color de luz  invalido")
    }
    println(message2)
}
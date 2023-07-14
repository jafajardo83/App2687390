package com.jafajardo83.app2687390

class Ciclos {
}


fun main() {

    var number:Int
    do{
        println("Ingrese un número")
        number= readLine()!!.toInt()
    }while(number>0)
/*
    var contp:Int=0
    var conti:Int=0

    var acump:Int=0
    var acumi:Int=0

    for (i in 1..3){
        println("Ingrese un número")
        var number= readLine()!!.toInt()
        if (number<=0){
            continue
        }
        else {

                if (number % 2 == 0) {
                    println("El numero es par $i")
                    contp = contp + 1
                    acump = acump + number
                } else {
                    println("El numero no es par $i")
                    conti = conti + 1
                    acumi = acumi + number
                }

        }



    }
    println("En total de números pares que ingresaste es $contp y suman $acump")
    println("En total de números impares que ingresaste es $conti y suman $acumi")*/

}

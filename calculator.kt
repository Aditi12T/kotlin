package com.oops

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    println("Enter the first number-")
    var num1 = sc.nextInt()
    println("Enter the second number-")
    var num2 = sc.nextInt()

    var cal = Calculation(num1, num2)

    println("Choose \n 1.Add \n 2.Sub \n 3.Mul \n 4.Div")

    var option = sc.nextInt()
    when (option) {
        1 -> cal.Add()
        2 -> cal.Sub()
        3 -> cal.Mul()
        4 -> cal.Div()

        else -> println("Wrong option...")
    }
}

    class Calculation(num1: Int, num2: Int)
    {
        var num1:Int=num1
        var num2:Int=num2

        fun Add(){
            println("$num1 + $num2 = ${num1+num2}")
        }
        fun Sub(){
            println("$num1 - $num2 = ${num1-num2}")
        }
        fun Mul(){
            println("$num1 * $num2 = ${num1*num2}")
        }
        fun Div(){
            println("$num1 / $num2 = ${num1/num2}")
        }
    }



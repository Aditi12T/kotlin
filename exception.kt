import java.util.*
import java.lang.Exception

fun main(args: Array<String>){
    var sc=Scanner(System.`in`)

    try{
        println("enter num1:")
        var num1=sc.nextInt()

        println("enter num2:")
        var num2=sc.nextInt()

        var div=num1/num2

        println("Division of num1 and num2 : $div")
    }
    catch(e:ArithmeticException){
         println("0 is not accepted")
    }
    catch(e:Exception){
        println("error")
    }

}

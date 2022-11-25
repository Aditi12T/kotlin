import java.util.Scanner
val age=fun(age:Int):String{
    if(age<18){
        return "You are not an adult"
    }
    else if(age>=18 && age<=55){
        return "You are an adult"
    }
    else {
        return "you are a senior citizen"
    }
}
fun main(args:Array<String>){
    //val result=age(65)
    //println(result)
    var sc= Scanner(System.`in`)
    print("Enter the age to check: ")
    var age=sc.nextInt()
    val result = age(age)
    println(result)
}



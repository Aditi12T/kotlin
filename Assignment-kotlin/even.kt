//print even numbers between 1-20

fun main(args: Array<String>) {
    for(i in 1..20){
        if(i % 2 == 0){
            println("$i")
        }
    }
}
fun main(args: Array<String>) {
    println("numbers divisible by 3 and 5 are: ")
    for(i in 1..100){
        if(i%3==0 && i%5==0){
            print("$i\n")
        }
    }
}
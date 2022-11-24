package collection

fun main() {
    var players = mutableMapOf<String,String>()

    players.put("sachin","is a batsman")
    players.put("dhoni","is a wicketkeeper")
    players.put("dravid","is a batsman")
    players.put("shami","is a baller")
    players.put("dhoni","is a captain")

    println(players)
    println("size = ${players.size}")

    println("keys = ${players.keys}")
    println("value = ${players.values}")
    println("both keys and values = ${players.entries}")
    var a:String? = players.get("dravid")
    println(a)
    println({players.get("dravid")})

    for(key in players.keys)
        println(key)
    println("---------")

    for(keyValue in players.entries)
        println(keyValue)

}




//another example of map----

/*fun main() {

    var products = mutableMapOf<String,Int>("laptop" to 20000,"smart watch" to 1000,"cloth" to 1500)

    println(products)

    for (keyValue in products.entries)
    {
        println("$keyValue  ,  ${keyValue.key}  , ${keyValue.value}")
    }

}*/
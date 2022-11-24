package collection


fun main() {
    var javabatch = mutableListOf<String>("anil","gopal","ankit","manish","kumar")
    var kotlinbatch = mutableListOf<String>("ankit","kumar","manish","rahul")

    //kotlinbatch.remove("ankit")
    //kotlinbatch.remove("manish")

    //val newbatch = ListUtils.union(javabatch,kotlinbatch)
    //println("newbatch: $newbatch")

    kotlinbatch.removeAll(javabatch)
    print("$kotlinbatch")

    kotlinbatch.addAll(javabatch)
    print(" after combining:\n $kotlinbatch")

    val sortAsc = kotlinbatch.sorted()
    println("sorting in ascending order:\n $kotlinbatch")

}
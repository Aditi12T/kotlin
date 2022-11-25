package com.axis.database

import com.axis.model.Wrestler

class WrestlerDb {
    var wrestler=mutableListOf<Wrestler>()
    init{
        wrestler.add(Wrestler("Elvis",25,5.2f,45.0))
        wrestler.add(Wrestler("Tom",24,5.0f,78.0))
        wrestler.add(Wrestler("Shawn",25,6.0f,88.0))

    }
    fun wrestler1():MutableList<Wrestler> {
        return wrestler
    }
}


package crux

import java.util.*

class TheMeeting{
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()
    fun create(){}
}

fun main() {
    val m = TheMeeting()
     with(m){
         Title = "Board meeting"
         When = Date(2017, 1, 1)
         Who.add("kevin")
     }
    m.apply {
        Title = "Board meeting"
        When = Date(2017, 1, 1)
        Who.add("kevin")
    }.create()
}
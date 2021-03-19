package crux.kotlin

import java.util.*

data class  Data (val year: Int, val month: Int, val day: Int)

fun parseDate(str: String): Data? {
    val regex: Regex = """(\d+)- (\d+)- (\d+)""".toRegex()
    val (y: String, m: String, d: String) = regex.find(str)?.destructured ?: return null
    return Data(y.toInt(), m.toInt(), d.toInt())
}

fun main() {
    println(parseDate("2020-01-13"))
}
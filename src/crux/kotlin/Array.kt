package crux.kotlin

fun main(args: Array<String>) {
    for (i in args.indices){
        println("$i ${args[i]}")
    }

    val items = IntArray(2)
    items[0] = 1
    items[1] = 2

    val numbers = intArrayOf(1,2,3,4,5)

    numbers.forEachIndexed{index, element ->
        println("$index is: $element")
    }

}
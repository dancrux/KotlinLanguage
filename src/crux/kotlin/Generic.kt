package crux.kotlin

fun main() {
    var names: List<String> = listOf("kevin", "Alex")

    val name = names.itemAt(0)

    println(name)

    val n: Node<Int> = Node(2)

    println(n.value())
}

fun <T> List<T>.itemAt(ndx: Int) : T {
    return this[ndx]
}

class Node<T>(private val item: T){
    fun value(): T {
        return item
    }
}
package crux.kotlin

fun main() {
    val array = arrayOf(6,1,5,4)
    insertSort(array).forEach { print("$it") }
}
fun insertSort(array: Array<Int>):Array<Int>{
    for (index in array.indices){
        val currentItem = array[index]
        var y = index
        while (y > 0 && array[y-1] > currentItem){
            array[y] = array[y-1]
            y--
        }
        array[y] = currentItem
    }
    return array
}
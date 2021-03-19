package crux.kotlin

fun main() {
    val list = listOf(2, 4, 5, 6, 7, 8, 9, 1, 20, 23 ,14, 3, 13, 12, 15, 18, 17)
    secondPrintSort(list)
//    printSorted(list)
}

fun printSorted(numbers: List<Int>){
    if (numbers.isEmpty()) return

    var currentCount = 0
    var minValue = Int.MIN_VALUE

    for (value in numbers){
        if (value == minValue){
            println(value)
            currentCount += 1
        }
    }
    while (currentCount < numbers.size){
        var currentValue = numbers.max()!!
        for (value in numbers){
            if (value < currentValue && value > minValue){
                currentValue = value
            }
        }

        for (value in numbers){
            if (value == currentValue){
                println(value)
                currentCount += 1
            }
        }
        minValue = currentValue
    }
}

fun secondPrintSort(numbers: List<Int>){
    val sorted = numbers.sorted()
    for (element in sorted){
        println(element)
    }
}
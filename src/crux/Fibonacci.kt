package crux

fun main() {
    var fib = Fibonacci()
    var total = 0
//    fib.fibonacci(8)
//    fib.fibonacci(8, object : Process{
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })

//    fib.fibonacci(8,{n -> println(n)})
//    fib.fibonacci(8){println(it)}
//    fib.fibonacci(8, ::println)

    fib.fibonacci(8){it -> total += it}
    println(total)
}
interface Process{
    fun execute(value: Int)
}
class Fibonacci {
//    fun fibonacci(limit: Int, action: Process){
//        var prev = 0
//        var prevprev = 0
//        var current = 1
//
//        for (i: Int in 1..limit){
//           action.execute(current)
//
//            var temp = current
//            prevprev = prev
//            prev = temp
//            current = prev + prevprev
//        }
//    }
    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
           action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
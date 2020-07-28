package crux

val action = { println("Hello World")}
//val calc = {x: Int, y:Int  -> x * y}
val calc: (Int, Int) -> Int ={x , y -> x * y}

fun main() {
    doSomething(action)
}

fun doSomething(func: () -> Unit){
    func()
}
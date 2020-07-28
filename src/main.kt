import java.io.FileReader
import java.io.IOException
import java.util.*

fun main (args:Array<String>){
//    var reader = FileReader("filename")
//    try {
//        reader.read()
//    }catch (e: IOException){
//
//    }finally {
//
//    }
    println("Hello World")

    val q = Question()

    q.display()

    var numbers = listOf(1,2,3,4,5)

    for (i in   numbers){
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["kelvin"]= 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name,age) in ages){
        println("$name is $age")
    }
    for ((index, element) in numbers.withIndex()){
        println("$element at $index")
    }
//    var kelvin = Person("kelvin")
//
//
//    println("NAme is ${kelvin.Name}")
//    kelvin.display()
//    kelvin.displayWithLambda(::printName)


}
class Question{
    var Answer: String? = null
    val correctAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything"

    fun display(){
        println("You Said $Answer")
    }
    fun printResult(){
        when(Answer){
            correctAnswer-> println("You were Correct")
            else -> println("Try again?")
        }
    }
}
fun useQuestion(){
    println("Hello world")
    val q: Question = Question()
}
fun printName(name: String){
    println(name)
}
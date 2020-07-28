package crux

fun iter (seq: Sequence<String>){
    for(t in seq) println(t)
}
fun main() {
    val ints = listOf(1,2,3,4,5)
    val smallInts = ints.filter { it < 4 }

//    for (i: Int in smallInts) println(i)

    val squaredInts = ints.map { it*it }

//    for (i: Int in squaredInts) println(i)
    val smallSquaredInts = ints.
        filter { it < 5 }.
        map { it * it }

    val meetings = listOf(Meeting(1, " Board meeting"), Meeting(2, "Committee Meeting"))

    val titles: Sequence<String> = meetings
        .asSequence()
        .filter { println("filter $it"); it.title.endsWith("g") }
    .map { println("map $it");it.title}

    iter(titles)
//    for (t in titles) println(t)
////
////        val title = meetings
////            .asSequence()
////            .map { println("map($it)"); it.title.toUpperCase()}
////            .find{ it.startsWith("BOARD")}
////    println(title)

}

class Meeting(val id: Int, val title: String){
    val people = listOf(Individual("son"), Individual("Alex"))

}
class Individual(val name: String){}
package crux

fun main(args: Array<String>): Unit {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee meeting"))

    val people = meetings.map(Meeting::people).distinct()

//    for (p in people) println(p.name)
}
package crux.kotlin

fun main(args: Array<String>) {
    val meetings = listOf(BoardMeeting(), FinanceMeeting())
    val board = meetings.typeOf<BoardMeeting>()

    println(board.count())
}

inline fun <reified T> List<*>.typeOf() : List<T> {
    val returnList = mutableListOf<T>()

    for (item in this){
        if (item is T){
            returnList.add(item)
        }
    }
    return returnList
}

fun <T: MeetUp> buildMeeting(meetingClass: Class<T>, action:(T) -> Unit): T{
    val meeting: T = meetingClass.newInstance()
    action(meeting)
    return meeting
}

inline fun <reified T: MeetUp> buildMeeting(noinline action: (T) -> Unit): T {
    return buildMeeting(T:: class.java, action)
}
open class MeetUp {
    fun attend() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class BoardMeeting : MeetUp(){

}

class FinanceMeeting : MeetUp(){

}
package crux.kotlin

fun main() {
    var financialMeeting = mutableListOf(FinanceMeeting())
    var meetings: AllMeetings<FinanceMeeting> = AllMeetings(financialMeeting)

    attendAllMeetings(meetings)

}

class AllMeetings<out T: MeetUp>(val meetings: List<MeetUp>){
    val count: Int get() = meetings.count()

    operator fun get(i: Int) = meetings[i]
}

fun attendAllMeetings(meetings: AllMeetings<MeetUp>){
    for (i in 0 until meetings.count)
        meetings[i].attend()
}
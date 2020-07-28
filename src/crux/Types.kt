package crux

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface EndOfTheWorld{
     fun setTime(time: KevinTime){}
}
class KevinTime{
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0

}

class YetiTime: Time, EndOfTheWorld{
    override fun setTime(time: KevinTime) {
        super<EndOfTheWorld>.setTime(time)
    }
   override  fun setTime(hours: Int, mins: Int , secs: Int ){}
}
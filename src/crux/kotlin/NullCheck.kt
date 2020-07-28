package crux.kotlin

fun main(args: Array<String>) {
    var m: Meeting? = null
    var newMeeting = Meeting()

    newMeeting = m ?: Meeting()
    closeMeeting(newMeeting)
    closeMeeting(m)

    m?.let { closeMeetingNonNull(m)}
}

fun closeMeetingNonNull(m: Meeting): Boolean?{
    return if (m.canClose) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean?{
    return if(m?.canClose == true) m.close()
    else false
}

class Meeting{
    val canClose: Boolean = false
   lateinit var address: Address

    fun close(): Boolean {
        return true
    }
    fun save(o: Any){
        val saveable = o as? ISaveable
        saveable?.save()
    }

    fun init(addr: Address){
        address= addr
    }
}

interface ISaveable{
    fun save()
}

class Address{

}
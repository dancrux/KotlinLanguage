package crux

fun main(args: Array<String>){
    val kevin = Student("kevin", "jones", 1, "tutor")
    print(kevin.id)
}

class Program{
    companion object{
        fun main(args: Array<String>){
            val kevin = Student("kevin", "jones", 1, "tutor")
            print(kevin.id)
        }
    }
}
 abstract class Person( var firstName: String ,var lastName: String){


    open fun getName() : String = "$firstName $lastName"
     abstract fun getAddress(): String
}
open class Student(firstName: String, lastName: String, _id: Int , val tutor: String = "") : Person(firstName, lastName){
    val id: Int

    init {
        id =_id

    }
    fun enrole(courseName : String){
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }
    override fun getAddress(): String {
        return " "
    }

    override  fun getName(): String{return ""}

    companion object : XmlSerializer<Student>{
        override fun toXml(item: Student) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate{
            return Postgraduate(name)
        }
    }
}

 class Undergraduate(firstName: String) : Student(firstName, "", 1){

 }
class Postgraduate(firstName: String) : Student(firstName, "", 1)

interface XmlSerializer<T>{
    fun toXml(item: T)
}
package crux.kotlin

fun main() {
    var people: MutableList<Person?>? = null
    people = mutableListOf(Person(23), Person(23))

    people.add(null)

    for(person in people.filterNotNull()){
        println(person.age)
    }
}

class Person(val age: Int){

}
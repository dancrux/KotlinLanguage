package crux

fun main(args: Array<String>) {
    var kevin = StudentDetail(1, "kevin")
    var jones = StudentDetail(1, "kevin")

    println(kevin)

    if (kevin == jones){
        println("Equal")
    }else{
        println("Not Equal")
    }
    var newKevin = kevin.copy(name = "Robert")
    println(newKevin)

}

data class StudentDetail(val id: Int, val name: String){

}
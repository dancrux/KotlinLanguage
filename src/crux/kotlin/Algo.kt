package crux.kotlin


    fun main (){
        print(removeVowels("a b e i g r i o h u"))
//        val numberArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
//        for (index in numberArray.size -1 downTo 1 step 2)
//            print(numberArray[index])
//        val numberArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
//        for(index in numberArray.indices - 5) {
//            print(numberArray[index])
//        }
//        val numberArray = intArrayOf(0, 1, 2,3,4, 5,6, 7, 8, 9)
//        for(index in (1 until numberArray.size)){
//            print(numberArray[index])
//        }
    }

fun removeVowels(string: String): String{
    val vowels = setOf('a','e','i','o','u')

    return string.trim().filterNot { it in vowels }
}
//fun runningSums(num: IntArray): IntArray{
//    return num.reduce((sum, element)-> sum+element)
//}


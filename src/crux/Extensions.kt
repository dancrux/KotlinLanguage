package crux

fun main(args: Array<String>){
    val text = "With    multiple  \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

fun replaceMultipleWhiteSpace(value: String): String{
    var regex = Regex("\\s+")
    return regex.replace(value, "")
}
fun String.replaceMultipleWhiteSpaceEx(): String{
    var regex = Regex("\\s+")
    return regex.replace(this, "")
}
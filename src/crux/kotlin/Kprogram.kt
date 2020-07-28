package crux.kotlin

import crux.java.User

fun main() {
    var user = User("kevin")

    var count = 0

    var eventListener = {u: User -> println("User $u has been created: ${++count} times")}

    user.create { println("User $it has been created: ${++count} times") }
    user.create { println("User $it has been created: ${++count} times") }
}
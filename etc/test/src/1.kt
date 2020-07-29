fun main() {
    var c=counter()
    println(c())
    println(c())
}

fun counter(): () ->Int {
    var count = 0
    return {
        count++
    }
}
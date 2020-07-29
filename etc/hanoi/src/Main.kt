class hanoi(){
    var list1 = mutableListOf<Int>(3, 2, 1)
    var list2 = mutableListOf<Int>()
    var list3 = mutableListOf<Int>()
    val mas = listOf(list1, list2, list3)
    var point = 0
    var nextPoint = 1
    var tail =0
    var nextTail =0


    fun main() {
        pickUp()
        println(tail)
    }

    fun pickUp(){
        tail = mas[point].lastIndex
    }
}
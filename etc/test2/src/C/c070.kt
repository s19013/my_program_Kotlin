//fun main() {
//    val N = readLine()!!.toInt()
//    var box = mutableListOf<String>()
//    for (i in 0 until N){
//        box.add(readLine()!!)
//    }
//    for (S in box){
//        Cut(S)
//    }
//}
//
//fun Cut(S:String):Unit {
//    var A = mutableListOf<Int>(0,0,0)
//    var cut = mutableListOf<String>()
//    for (element in S){
//        cut.add(element.toString().trim())
//    }
//    cut.sort()
//    A[0] = check(0,cut)
//    if (A[0] == 1) A[1] =check(1,cut)
//    else if (A[0] == 2) A[1] = check(2,cut)
//    if (A[1] == 1) A[2] =check(2,cut)
//    if (A[0] ==2 && A[1] ==2) {
//        println("Two Pair")
//        return
//    }
//    when (A.max()){
//        4 -> println("Four Card")
//        3 -> println("Three Card")
//        2 -> println("One Pair")
//        else -> println("No Pair")
//    }
//}
//
//fun check(n:Int,L:MutableList<String>):Int{
//    var num = 1
//    for (i in n until L.size-1){
//        if (L[n]==L[i+1]) num +=1
//    }
//    return num
//}

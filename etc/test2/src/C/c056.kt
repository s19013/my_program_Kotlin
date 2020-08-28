//val A = readLine()!!.split(" ")
//val N = A[0].toInt()
//val M = A[1].toInt()
//var students :MutableList<MutableList<Int>> = mutableListOf()
//var pass = mutableListOf<Int>()
//fun main() {
//    for (i in 1..N){
//        val box = mutableListOf<Int>()
//        val score = readLine()!!.split(" ")
//        box.add(i)
//        box.add(score[0].toInt())
//        box.add(score[1].toInt())
//        students.add(box)
//    }
//
//    for (i in 0 until N){
//        val a = students[i][1]-students[i][2]*5
//        if (a>=M) pass.add(students[i][0])
//    }
//
//    for (i in  pass) println(i)
//
//}
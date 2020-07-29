class Main(){
    var list1 = mutableListOf(3, 2, 1)
    var list2 = mutableListOf<Int>()
    var list3 = mutableListOf<Int>()
    val mas = listOf(list1, list2, list3)
    var tail =1
    var nextTail =2
    var point = 0
    var nextPoint =1


    tailrec fun Master(){
        if (list3.size==3){
            return
        }
        toIn()
        F()
        P()
        Master()
    }

    fun toIn(): Unit {
        while (true) {
            if (point == mas.size/2&& nextPoint == mas.size/2){
                nextPoint+=1
            } else if (point == nextPoint){
                point+=1
            }
            if (point>=mas.size){
                point =0
            }
            if (nextPoint>=mas.size){
                nextPoint=0
            }
            when{
                mas[point].isEmpty() -> point+=1
            }
            if (point<3 && point!=nextPoint && mas[point].isNotEmpty() && nextPoint<3) {
                break
            }
        }
        println("point:$point")
        println("nextPoint:${nextPoint}")
    }

    fun F() {
        tail = mas[point].last()
        if (mas[nextPoint].isEmpty()) {
            mas[nextPoint].add(tail)
            mas[point].removeAt(mas[point].size-1)
            println("moved")
            return
        }
        nextTail = mas[nextPoint].last()
        if (tail<nextTail){
            mas[point].removeAt(mas[point].size-1)
            mas[nextPoint].add(tail)
            println("moved")
        }
        else{ println("can't move")}
        println()
        nextPoint +=1
    }

    fun P(){
        println(list1)
        println(list2)
        println(list3)
    }
}

fun main() {
    val A = Main()
    A.Master()
}

//    fun Echeck(){
//        when{
//            point == nextPoint -> point +=1
//        }
//        when{
//            point>2 -> point=0
//            nextPoint>2 -> nextPoint=1
//        }
//    }

//    fun pickUp(){
//        try {
//
//        }
//        catch (e:Exception){
//
//        }
//        tail = mas[point].last()
//        nextTail = mas[nextPoint].last()
//    }
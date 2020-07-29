fun main() {
//    val aaa = ::makeSome
//    aaa("ABC",{it+ "bentou"})
//    println(makeSome("ABC",{it + "で"+"おにぎり"}))
//    println(example1(4,{2}))
    val B = arrayListOf<Int>(1,2,3)
    println(A(B))
}
fun s(str:String): Int {
    tailrec fun go(str:String,index:Int): Int =
        when{
            str.isEmpty() -> -1
            str.first() == 'K' ->{
                println(str)
                index
            }
            else -> {
                println(str)
                go(str.drop(1),index+1)
            }
        }
    return  go(str, 1)
}
//最初に関数sの中のgoに受け取ったstrと1を入れる
//あとは、goが再帰処理してくれる

fun makeSome(zairyou:String,func:(String) ->String):String{
    return "${func(zairyou)}をつくりました"
}

inline fun example1(num: Int, func: ()-> Int): Double{
    val x = func().toDouble()
    return num / x
}

fun A(list:List<Int>):String{
    list.forEach{ x->
        if (x==2){
            return "L"
        }
    }
    return "F"
}
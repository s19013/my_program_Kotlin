fun main() {
    println(s("sssKss"))
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
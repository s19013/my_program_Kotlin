fun main() {
    println(s("sssssK"))
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
    return  go(str, 0)
}



fun main() {
    while (true){
        println("入力")
        val input = readLine()!!
        if (input.length==4){
            println(F(input))
            break
        }
        println("いれなおし")
    }
}

fun F(S:String):String{
    val jackpot = "1234"
    if (S==jackpot) {
        return  "strght"
    }
    for (i in 0..3){
        if(S[i] in jackpot){
            return "box"
        }
    }
    return "miss"
}


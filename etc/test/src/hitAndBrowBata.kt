var jackpot :String = ""
var S : String = ""
fun main(args: Array<String>) {
    decideJackpot()
    con()
}

fun decideJackpot(){
    val l = (0..9).toMutableList()
    l.shuffle()
    for (x in 1..4){
        jackpot +=l[1].toString()
        l.removeAt(1)
//        println(jackpot)
    }

}

fun con(){
    var count = 10
    while (true){
        var hit =0
        var brow =0
        if (count ==0){
            println("回数切れ")
            println("答え${jackpot}")
            break
        }
        loop@ while (true){
            println("入力")
            S = readLine()!!
            when{
                S.length!= 4-> {
                    println("いれなおし")
                }
                else -> break@loop
            }
        }
        if (S==jackpot){
            println("hit:4")
            break
        }
        else for (x in 0..S.length-1) {
            when{
                S[x]==jackpot[x] ->hit+=1
                S[x] in jackpot -> brow+=1
                else ->{}
            }
        }
        println("hit:$hit brow:$brow")
        count -=1
        println("のこり${count}回")
    }
}




var jackpot :String = ""
var count = 10
var gaming = true
fun main(args: Array<String>) {
    decideJackpot()
    while (gaming){
        input()
    }
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

fun input(){
    var S : String =""
    loop@ while (true){
        var I =0
        runCatching {
            println("入力")
            I = readLine()?.toInt()?:0
        }.onFailure {
            S=""
//                println("いれなおし")
        }.onSuccess {S=I.toString() }
        when{
            S.length!= 4-> {
                println("いれなおし")
                S=""
            }
            else -> break@loop
        }
    }
    con(S)
}

fun con(str:String){
        var hit =0
        var brow =0
        if (count ==0){
            println("回数切れ")
            println("答え${jackpot}")
            gaming =false
            return
        }
        if (str==jackpot){
            println("hit:4")
            gaming = false
            return
        }
        else for (x in 0..str.length-1) {
            when{
                str[x]==jackpot[x] ->hit+=1
                str[x] in jackpot -> {
                    brow+=1
                }
                else ->{}
            }
        }
        println("hit:$hit brow:$brow")
        count -=1
        println("のこり${count}回")
}




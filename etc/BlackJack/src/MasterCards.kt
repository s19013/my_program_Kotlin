class MasterCards {
    var Cards :MutableList<MutableList<String>> = mutableListOf()
    val SMarks = listOf<String>("J","Q","K")

    fun setUp(){
        for (i in 1..10){
            val box :MutableList<String> = mutableListOf()
            if (i==1) box.add("A")
            else box.add(i.toString())
            box.add(i.toString())
            Cards.add(box)
        }

        for (s in SMarks){
            val box :MutableList<String> = mutableListOf()
            box.add(s)
            box.add(10.toString())
            Cards.add(box)
        }
        Cards.shuffle()
    }

    fun giveCard(): List<String> {
        val box :MutableList<String> = mutableListOf()
         for (i in 0..1) box.add(Cards[0][1])
        Cards.removeAt(0)
        return box
    }

    fun dbShowCards() {
        println(Cards)
    }
}
class Test {
    val MC = MasterCards()
    fun TestShowCards(){
        MC.setUp()
        MC.dbShowCards()
    }

    fun TestGiveCards(){
        MC.setUp()
        println(MC.giveCard())
    }

}

fun main() {
    val T = Test()
    T.TestGiveCards()
}
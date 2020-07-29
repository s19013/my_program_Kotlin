fun main() {
    l{"test"}

}
//多分mはラムダ式なのかもしれない。
inline fun l(debug:Boolean = true, m:()->String){
    if (debug){
        println(m())
    }
}
fun main() {
  println(f(5))
}

fun f(n:Int): Int {
  if(n==0){
    return 1;
  }
  return n*f(n-1);
}
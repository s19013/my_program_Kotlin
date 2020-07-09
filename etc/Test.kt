fun main(args: Array<String>) {
    for (i in 1..100){
        if (i%15==0){
            print(i)
            println(" fizzbuzz")
        }
        else if (i%3==0){
            print(i)
            println(" fizz")
        }
        else if (i%5==0){
            print(i)
            println(" buzz")
        }
        else{
            println(i)
        }
    }
}
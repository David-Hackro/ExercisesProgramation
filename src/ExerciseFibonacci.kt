
fun main(args: Array<String>){
    fibonacci()
}

/**
 * fun fibonacci(last: Int = 0, current: Int = 1)*
 */
fun fibonacci(last: Int = 0, current: Int = 1){

    if(last == 0){
        println("${last} + ${last}  = ${(last + last)}")
        println("${last} + ${current}  = ${(last + current)}")
        fibonacci(current,last + current)
    }else{
        if(current < 30){
            println("${last} + ${current}  = ${(last + current)}")
            fibonacci(current,last + current)
        }
    }

}



fun main(args: Array<String>){
    fibonacci()
}

/**
 * fun fibonacci(last: Int = 0, current: Int = 1)*
 */
fun fibonacci(last: Int = 0, current : Int = 1) {

    if (last < 40) {
        if (last == 0) {
            println(last)
        }
        println(current)
        fibonacci(current, last + current)
    }

}

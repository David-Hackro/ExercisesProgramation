

fun main (args : Array<String>){

    var textExample : String
    textExample = "reconocer"
    validatePalindromo(textExample)
}


/**
 * validatePalindromo(text : String)
 */
fun validatePalindromo(text : String){

    if(text.length >  1){
        if(text.get(0).equals(text.get(text.length-1))){
            validatePalindromo(text.substring(1,text.length-1))
        }else{
            print("No es Palindromo")
        }
    }else{
        print("Si es Palindromo")
    }
}






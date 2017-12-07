# Exercises of Programation

In this new seccion, i will resolve some exercises and test my logic and show my solutions using kotlin and a blackboard.

![blackboard](https://lh3.googleusercontent.com/-rx6TjivYKiY/WildZW0kT-I/AAAAAAAASm8/z_2e97vnJAwBJ_s9o3DaEUyeouVziAvCwCL0BGAYYCw/h1034/Captura%2Bde%2Bpantalla%2B2017-12-07%2Ba%2Bla%2528s%2529%2B09.24.46.png)

#### Example exercises 

```kotlin
    fun validatePalindrome(text : String){
        if(text.length >  1){
            if(text.get(0).equals(text.get(text.length-1))){
                validatePalindromo(text.substring(1,text.length-1))
            }else{
                print("No its Palindrome")
            }
        }else{
            print("Its Palindrome")
        }
}
```

##### send me your exercises and i will solved

Twitter: [@David Hackro](https://twitter.com/DavidHackro)

License
----

MIT


**Free Software, Hell Yeah!**


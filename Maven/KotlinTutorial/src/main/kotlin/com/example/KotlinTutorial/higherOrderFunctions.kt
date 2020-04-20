import java.util.function.Consumer

data class Alien2(var name: String, var age: Int)

fun main(args: Array<String>){
    var values = listOf<Alien2>( Alien2("Ritul", 21), Alien2("Pradeep", 22) )

//    var con: Consumer<Int> = object : Consumer<Int>
//    {
//        override fun accept(t: Int) {
//            println(t)
//        }
//    }

    //  Consumer is an interface through which "it" is implemented here
//    values.forEach( { println(it)} )    //  takes function inside of a function i.e passing a function inside a function
    //  "it" is used to define that, it'll take the values one by one
    values.forEach( { n -> println(n) } )   //  acts as "it"
                    //  fetching the value of n and then printing it
    values.forEach(::println)   //  whatever values i'll pass, print it,
    // :: is called as method reference i.e we're referring a method here, you can mention the className before the ::
}
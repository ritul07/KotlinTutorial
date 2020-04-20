//  list is an "interface" in Java, and it extends "Collection" interface


// list of objects
data class Alien1(var name: String, var age: Int)   //  there is no need that this class should be data class,
                                            //  it can be any type of class

//  list
//   in array, we can have a limited size, so you can't add elt or delete elt, to overcome this List is used
fun main(args: Array<String>){
//    var values = listOf<Int>(4,5,6,7)   //  by default, listOf<>() is an immutable list
    var values = mutableListOf<Int>(4,5,6,7)

    values.add(2,3)

    for (i in values)
        println(i)

    println()   //nextLine

    println(values.get(2))
    println(values.indexOf(7))

    //  list of objects
    //  the list can have objects as type
    var aliens = listOf<Alien1>( Alien1("Ritul", 21), Alien1("Pradeep", 22) )

    for (alien in aliens) {
        println(alien)
        println(alien.name) //  it can print explicit values also using different methods
    }

}
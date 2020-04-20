//  primary constructor
class Human (var n: String){ // inside the (), we can give the constructors without the "constructor" keyword
    var age: Int = 0
    var name: String = n

    //  secondary constructor
    constructor(age: Int, name: String): this(name){    //  if we've specified primary constructor, then we need to reference it
        this.age = age
    }

    fun think(){
        println("Kotlin is awesome... $name : $age")
    }
}

fun main(args: Array<String>) {
    var obj = Human(21, "Ritul")    // if we're not passing any values here,
                                    // then give a default value inside the constructor
    obj.think()                    // i.e default params also works here

}
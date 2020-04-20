abstract class Human1 {
    abstract fun intro()    //  abstract method is a kind of method where you don't need to define it just declare it
//    when we've a abstract method, it should be part of an abstract class

    fun talk(){
        println("talking...")
    }
}

class Doctor: Human1(){     //  here, we don't need to use the keyword "open", bcoz we're using abstract that means,
//    in future someone will be implementing it, so abstract classes are meant to be inherited.
    override fun intro() {  // if we're not defining this method, then we need to make this class, an abstract class
        println("Hey from Doctor class")
    }
}

class Alien : Human1(){
    override fun intro(){
        println("Hey from Alien class ")
    }
}


fun main(args: Array<String>) {
    var obj: Human1 = Alien()
    obj.talk()
    obj.intro()
}
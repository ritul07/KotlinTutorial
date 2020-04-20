//  companion object
//  static is not supported in kotlin
class D{
    companion object{
        @JvmStatic  //  if we add, this annotation, it'll be considered same as a static keyword and
        // then this method will be considered as a static method, and can be used with Java code
        //  and it is compulsory to use companion object to use this annotation, otherwise it won't work
        fun show(){
            println("in class D, of companion object")
        }
    }
}

class E{
    companion object{
        fun createObj(): E = E()    //  this function is written as an function expression i.e inline
        //  this method will return the object of this class E
        //  now, if we don't put this method in a companion object, we can't call this method from main,
        //  bcoz this itself is a method, hence we'll need an object to call createObj method
    }

    fun show(){
        println("in class E, of companion object as a factory pattern")
    }
}

fun main(args: Array<String>){
    D.show()    // here, we're able to call the method of class D, directly from the class name ->
    //  i.e this can be done when static method is created in the class of Java, but it's not like that here

    var obj = E.createObj() //  if we put the method createObj in an companion object,
    // then we can call the using the class name itself, and hence achieve a **factory design pattern** here.
    obj.show()

    //  Factory pattern: creating object in the factory method itself, using companion object,
    //  without using the legacy method of creating an object in the main class
}
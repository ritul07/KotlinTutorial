//  label:3 = going to Parent's primary constructor as param
open class Parent(age: Int) {  //  open keyword is added to make the class to be inherited by other classes
//    by default,, all classes and methods in kotlin are final i.e you can't change it without using "open"

    init {  //  primary constructor
        println("in Parent " + age)
    }
    open fun intro(){   // we made this open so that it can be over-ridden
        println("Hey from parent class ${count++}")     //  count, i just added to see how many times it is calling the method
    }
}

//  label:2 = going to Child's primary constructor, then again it's sending to Parent class as argument -> label:3
class Child(age: Int) : Parent(age){  //  colon is used to extend other classes
//    we can't extend more than one class here i.e multiple inheritance, bcoz JAVA also doesn't support it
//    but we can implement multiple-inheritance using interfaces, this also achieves abstraction

    init {
        println("in Child")
    }
    override fun intro(){   //  override is used to intentionally tell the compiler to override this method
    println("Hey from child class ")
}
}

var count: Int = 1

fun main(args: Array<String>) {
    /*
    var obj = Parent()
    obj.intro()

    var obj2: Parent = Child()  //  this is done to specify that, we're creating a reference of
                            // Parent class and object of Child class
    obj2.intro()

     */

    var obj3: Parent = Child(20)    //  we're passing 20 as parameter, it is going to label:2 (Scroll-UP)


}
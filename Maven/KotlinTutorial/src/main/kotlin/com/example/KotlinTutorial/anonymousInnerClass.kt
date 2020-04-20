interface Human2{
    fun think()
}

fun main(args: Array<String>){
//    var programmer: Human2 = Human2()   // this can't be done, bcoz this needs a class name
    var programmer: Human2 = object : Human2 // this is the syntax for anonymous inner class in Kotlin
//                          using the object keyword we're creating the instance only once and this instance is not reusable
                            {
                                override fun think() {
                                    println("Think virtually...")
                                }
                            }
    programmer.think()
}
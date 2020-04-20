//  the dataclass provides all of this by default
// 1. every class needs a toString()
// 2. equals & hashCode
// 3. copy

data class Laptop(val brand: String, val price: Int){
    fun show(){
        println("Laptops are awesome...")
    }
}

fun main(args: Array<String>){
    var lap1 = Laptop("Dell", 2000)
    var lap2 = Laptop("Dell", 2000)

    var lap3 = lap1.copy()  //  copy method copies the object of lap1 to lap3, basically copies it as it is
                            //    this copy method is also supported by only data class
    println(lap1.equals(lap2)) //  .equals() check not only values but hashCode of the objects also
    println(lap3)  //    if we won't use copy method then, equals method will return false

    var lap4 = lap1.copy(price = 2200)  // we can also change the values using this method
    println(lap4)

}
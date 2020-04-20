@file:JvmName("hello")
import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>){

    println("Hello !")
//  classes and objects
    var obj = Student()
    obj.name = "Ritul"
     println("Name is : ${obj.name}")

    var obj1 = Student1()
    obj1.name = "Mohan"
    println("Name is : ${obj1.name}")


    //  if-else expression
    var num1: Int = 4
    var num2: Int = 7
    var result: Int = 0

    result = if (num1 > num2)   //  if-else is not just a branching statement but acts an expression also i.e returns a result
        num1
    else if (num2 > num1)
        num2
    else
        0

    println("Greater no. is : $result")


    //  string comparison
    var str1: String = "Ritul"
    var str2: String = "ritul"

    //if (str1.equals(str2))
    //if (str1.equals(str2,true))   //  ignoreCase: true
    if (str1 == str2)   //  kotlin specific method
        println("Same")
    else
        println("Not Same")


    //  null handling
    var str3: String? = null    // "?" is null handler
//    var obj3 = Student()
//    println(obj3.name)
//    println(obj3.name?.length)   // if using nullable string, we've to use "?"

    var obj3: Student? = Student()      //  if we're using ?, we need to declare type of obj3
    println(obj3?.name)


    //  when
    val numWhen1: Int = 2

    when(numWhen1)
    {
        1 -> println("One") //  no need to use break here
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give proper input")    // default case
    }


    //  when expression
    val numWhen2: Int = 2

    val resultWhen = when(numWhen2)
    {
        1 -> "One" //  no need to use break here
        2 -> "Two"
        3 -> "Three"
        else -> "Give proper input"    // default case
    }
    println("Str is $resultWhen")


    //  range
    var rng = 1..10     //  also 'A'..'z' chars can be used
    for (a in rng)
        println(a)

    for(a in rng step 2)    //  prints every 2nd elt
        println(a)

    var rng2 = 10 downTo 1 //  makes a range from 10 - 1  downTo is a method
    //  SAME AS: 10.downTo(1)
    for (a in rng2)
        println(a)

    for (a in rng2.reversed())  // reverses the order
        println(a)

    //  1 until 10 gives 1-9, 10(excluded)
    // rng2.count() gives 10 i.e total count of elts



    //  list
    var list = listOf(1,2,3,4)

    for ( (i,v) in list.withIndex() )   //  withIndex() gives index of each elts
        println("$i : $v")



    //  map
    var maps = TreeMap<String, Int>()
    maps["Ritul"] = 22
    maps["Pradeep"] = 21

    for ( (name, age) in maps )
        println("$name is $age years old")


    //  default and named parameters
    println("Amount is : " + calcAmt(amt = 50,interest = 0.03))  // we can choose or not choose to send the interest param
    // above is called as named params i.e to avoid confusion we can name the params in any order


    //  try as an expression
    var strTry: String = "4a"

    var numTry: Int = try {    //  try can be used as an expression also
        strTry.toInt()
    }
    catch (e: NumberFormatException){
        //println("Give proper format")
        0   // it's an expression i.e why we return an Int
    }
    println(numTry)


    //  extension function
    var s1 = Student()
    s1.name = "Ritul"
    s1.show()

    var s2 = Student()
    s2.name = "Praddip"
    s2.show()

//    var s3 = s1.plus(s2)
    // infix function
    var s3 = s1 plus s2 //  infix function, this can be written instead of . and ()
    s3.show()

    //  operator overloading
    var s4 = s1 - s2
    s4.show()


}



//  default and named parameters
@JvmOverloads   // overloads this method so that it runs with Java also
fun calcAmt(amt: Int, interest: Double = 0.04): Int{    //  0.04 is default value of interest
    return (amt + amt*interest).toInt() //  toInt() typecasts to Int
}


//  extension function
//  infix function
infix fun Student.plus(s: Student): Student { //  plus method is a method of Student.kt written here
//    adding infix makes the plus keyword in the main function working without the dot and brackets
//    **infix functions takes only 1 params
    var newStudent = Student()
    newStudent.name = this.name + " " + s.name  //  this refers to s1
    return newStudent
}


//  operator overloading
operator fun Student.minus(s: Student): Student { //  operator keyword is used to overload the operator i.e,
// used in the main function
    var newStudent = Student()
    newStudent.name = this.name + " " + s.name  //  this refers to s1
    return newStudent
}
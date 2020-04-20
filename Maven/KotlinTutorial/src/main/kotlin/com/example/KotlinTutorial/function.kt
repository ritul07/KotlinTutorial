@file:JvmName("addFile")    //  annotate kt file with @file: JvmName("name")
                                    // to use it in a java file, to access kotlin's function
fun main(args: Array<String>)
{

    //  function
    add(5,10)

    println("add1 : " + add1(4,5))

    println("max : " + max(4,10) )
}

fun add(a: Int, b: Int){
    println("add : " + (a+b))
}

fun add1(a: Int, b: Int): Int = a+b //  this also does the same thing as above add function

fun max(a: Int, b: Int): Int = if (a>b) a else b
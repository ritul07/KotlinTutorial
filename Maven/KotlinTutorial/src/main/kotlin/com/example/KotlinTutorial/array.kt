//  array
fun main(args: Array<String>){
    var arr = intArrayOf(10,12,14,16)   // intArrayOf() imagine that you'll pass the parameters at the same time
    //  so, it can't be used in a place where you don't know the size of the array
//    in kotlin, we treat array as objects also, so we've various methods to manipulate the array
    println(arr.get(2)) //  get the elt at index 2
    arr.set(3,30)   //  set the elt at index 3 with the value passed

    println(arr.last()) //  returns the last elt of the array

    println()   // blank line
    for (i in arr)
        println(i)

    println()   // blank line
    println()   // blank line



    var arr2 = IntArray(4)  //  an array can be made using this method also,
    // if we're not specifying the values of the array, but passing only the size of the array as parameter
    arr2.set(0,10)
    arr2.set(1,20)
    arr2.set(2,30)
    arr2.set(3,40)

    for (i in arr2)
        println(i)

//    DoubleArray()     //  these two methods can be used respectively to create different types of array
//    FloatArray()
//    arrayOfNulls<String>()    // to make array of Nulls, i.e if you don't know the values
                                //  inside this <>, we can give String or className like Student,
                                //  of whatever type we want an array of.
                                //  inside this (), size of array is specified

}
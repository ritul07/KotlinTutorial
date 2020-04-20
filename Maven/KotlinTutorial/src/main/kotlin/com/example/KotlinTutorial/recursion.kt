import java.math.BigInteger

//  recursion factorial
//  if using BigInteger, we always have to convert normal Int to BigInteger when using nos. smaller than BigInteger
fun main(args: Array<String>) {
    var num = BigInteger("70")
    println(fact( BigInteger("70")) )
}

fun fact(n: BigInteger): BigInteger{
    if (n == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return n * fact(n - BigInteger.ONE)
}
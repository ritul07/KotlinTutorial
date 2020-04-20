import java.math.BigInteger
// tail recursion
fun main(args: Array<String>) {
    var num = BigInteger("70000")
    println(fact(num, BigInteger.ONE) ) //  passing number and initial value of result i.e 1
}

tailrec fun fact(n: BigInteger, result: BigInteger): BigInteger{
    if (n == BigInteger.ZERO)   //  when value of n hits 0,
        return result        // then return value of result
    else
        return fact(n - BigInteger.ONE, n * result) //  if n==5, then fact( 5-1, 5*1) -> fact( 4-1, 4*(5*1) ) -> so on..
}
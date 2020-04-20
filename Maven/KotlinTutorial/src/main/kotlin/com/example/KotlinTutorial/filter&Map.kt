fun main(args: Array<String>) {
    var values = listOf<Int>(4, 5, 6, 7, 1, 2, 3)

    var evens = values.filter { it%2 == 0 }
    var doubleValues = evens.map { it*2 } //  map will take the value and it'll convert the value in some other value
   // var reduced = values.reduce()

    evens.forEach( { println(it) } )
    doubleValues.forEach( { println(it) } )

    var results =   values
                        .filter { it%2 == 0 }
                        .map { it*2 }

    results.forEach( { println(it) } )
}
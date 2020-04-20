data class Book (var name: String, var price: Int)

// this is an object itself, and this is a class that represents an object and also an object name
object BookShelf{   //  it is a singleton class, and be used a normal class
    //  makes sure that you've only one object, with the object name as "BookShelf" i.e same name
    var books = arrayListOf<Book>()

    fun showBooks(){
        for ( (book,price) in books )
            println("$book is of $$price")
    }
}

fun main(args: Array<String>){
    BookShelf.books.add(Book("Java",50))
    BookShelf.books.add(Book("Sql",40))
    BookShelf.books.add(Book("Kotlin",80))
    BookShelf.showBooks()
}
interface A{
    fun show()

    fun abc(){  // JAVA removed multiple-inheritance to avoid ambiguity issue
        println("in abc A")
    }
}

interface B{
    fun display()

    fun abc(){
        println("in abc B")
    }
}

// interface does support multiple-inheritance
class C: A,B {  //  we've to define both the methods in both the interfaces, and override 'em,
    // bcoz we're overriding the functions of an interface
    override fun show(){
        println("in show")
    }

    override fun display(){
        println("in display")
    }

    override fun abc() {
        //println("in abc C")
        super<A>.abc()  //to call specific method, either of interface A or B, then use "super<name_of_interface>.method_name()"
    }
}

fun main(args: Array<String>){
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()
}
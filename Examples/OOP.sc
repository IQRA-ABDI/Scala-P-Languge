object MyClass extends App{
    class person(val name: String, movie: String) {
        def likes(bestmovie: String): Boolean = bestmovie == movie
        def hangoutwith(anotherperson: person): String = s"${this.name} is hanging out with ${anotherperson.name}"
        def +(anotherperson: person): String = s"${this.name} is hanging out with ${anotherperson.name}"
        def unary_! : String = s"$name, what the heck!"
        def isAlive = Boolean = true
        def apply(): String = s"Hi, my name is $name and i like $movie"
    }
    
val Iqra = new person("Iqra", "juu")
    println(aisha.likes("juu"))
    println(aisha likes "juu") //equavalent  object method parameter
//  this operators are called infix notation = operator notation or syntatic notation
    
val tom = new person("tom", "super powers")
    println(aisha hangoutwith tom)
    println(aisha + tom)
    println(1.+(2))

// prefix notation 
val x = -1   // -1 is uniry operators  also maethod
val y = 1.unary_-  
println(!aisha)
println(aish.unary_!)
// postfix notation
println(aisha.isAlive)
println(aisha isAlive) //a sugar syntatics -- but is available without parameters
    
// special method called apply
    println(aisha.apply())
}
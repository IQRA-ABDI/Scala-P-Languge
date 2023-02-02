



object BasicScala {
/*<script>*///three ways  we can print expressions in scala
println("hello Scala")
print ("hello scala")
printf("hello scala")

// 2 ways we can store variables in scala

// one way              // another way 
val number=20           val number : int = 20 
val Name="hey guys"     val Name : String ="hey guys"
val symbol = 'i'        val symbol: Char='i'
val longVar=8889997L    val longVar: Long=6778887L
val shortVar=12983      val shorVar: Short=231
val floatVar=23.32F     val floatVar : Float=23.32F
val doubleVar=788.887   val doubleVar : Double=788.887

// you can use var and var is muteable or a can be changed 
 //val can't be changed in  / constant

var num=10 // var can be changed /*</script>*/ /*<generated>*/
def args = BasicScala_sc.args$
  /*</generated>*/
}

object BasicScala_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }
  def main(args: Array[String]): Unit = {
    args$set(args)
    BasicScala.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}


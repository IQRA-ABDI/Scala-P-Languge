



object ExpressionsScala {
/*<script>*///simple calculations
val num1=10
val num2=20
val add = num1+num2
val sub = num2-num1
val mul= num2 * num1
val div= num2/num1
println(num1 + " + " + num2 +" = "+ add)
println(num1 + " - " + num2 +" = "+ sub)
println(num1 + " * " + num2 +" = "+ mul)
println(num1 +" / " + num2 +" = "+ div)

// simple grade calculation
if(grade==90){
  println("A")
}
else if(grade==80){
  println("B")
}
else if(grade==70){
  println("C")
}
else if(grade==60){
  println("D")
}
else {
  println("you failed")
}


// some loop
var i =0
while (i<=200){
  println(i)
  i=i+10
}

var A =200
while (A>=1){
  println(A)
  A=A-20
}/*</script>*/ /*<generated>*/
def args = ExpressionsScala_sc.args$
  /*</generated>*/
}

object ExpressionsScala_sc {
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
    ExpressionsScala.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}


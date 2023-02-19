import scala.util.Success
import scala.util.Fail

//partial functions
val apartialFunction: PartialFunction[Int , Int] = {
  case 1 => 42
  case 2 => 252
  case 5 => 999
  case 7 => 100

}
println(apartialFunction(7))

//curried function
val superAdder : Int => Int => Int =
  x=>y=>x+y
val add3=superAdder(3)
println(add3(5))
println(superAdder(5)(5))

//lazy evaluation 
lazy val x:Int ={
  println("hello")
  42
}
println(x)

        

//Monads        

trait Attampt[+A]{
  def flatMap[B](f: A=> Attempt[B]):Attampt[B]
}
object Attempt{
  def apply [A](a: =>A):Attempt[A]=
    try{
      Success(a)
    }catch{
      case e:Throwable => Fail(e)
    }
}
case class Success[+A](value: A)extends Attempt [A]{
  def flatMap[0](f: A=>Attempt[B]): Attempt[B]=
   try{
      f(value)
    }catch{
      case e:Throwable => Fail(e)
    }
    
  }
  case class Fail(e: Throwable)extends Attempt[Nothing]{
    def flatMap[0](f: nothing => Attempt[0]): Attempt[B]=this
  }
        

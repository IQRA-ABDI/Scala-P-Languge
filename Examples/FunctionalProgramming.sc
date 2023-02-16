import java.util.Random
import scala.util.Failure
import java.{util => ju}
import scala.util.{Try, Failure , Success}
//Function
val doubler = new myfunction[Int , Int] {
  override def apply(element : Int): Int=element * 2
}
println(doubler(2))

trait myfunction[A,B]{
  def apply(element : A) : B
}

//Anonymous function 
val doubler2 = (x:Int) =>x*2
println(doubler2(2))

//Higher Order Functions and curries
def nTimes(f: Int => Int, n:Int , x:Int) : Int = 
if (n<=0) x
else nTimes(f, n-1, f(x))
val plusOne=(x:Int)=> x + 1
println(nTimes(plusOne ,10, 1))

// map,flatMap,Filter
val list = List(1,2,3)
println(list)
println(list.contains(2))
println(list.head)
println(list.tail)

//map
println(list.map(_+1))
println(list.map(_+" is a number"))

//filter
println(list.filter(_% 2==0))
println(list.filter(_% 3==0))


//flatmap
val topair=(x:Int) => List(x,x+1)
println(list.flatMap(topair))


//sequences
val asequence = Seq(1,2,3,4)
println(asequence)
println(asequence.reverse)
println(asequence(2))
println(asequence ++ Seq(6,5,8,7))
println(asequence.sorted)

//Array 
val num= Array(1,2,3,4)
val threeElements = Array.ofDim[Int](3)
println(threeElements)
threeElements.foreach(println)
num(2)=0
println(num.mkString(" "))

//arrays and seq 
val numseq: Seq [Int] = num // implicit conversion
println(numseq)



// vectors
val vector: Vector[Int] = Vector(1,2,3)
println(vector)

//Tuples 
val aTuple = (2, "hello, scala")
println(aTuple._1)//2
println(aTuple.copy(_2=" goodbye c++"))
println(aTuple.swap)



//map
val aMap:Map[String ,Int]= Map()
val phonebook =Map(("jim",555),"Daniel" ->789)
println(phonebook)


//option
val myfirstoption:Option[Int] = Some(4)
val noOption:Option[Int]= None
println(myfirstoption)
println(noOption)

//unsafe APIs
def unsavemethod():String = null
//val result = Some(null)// wrong
val result = Option(unsavemethod())
println(result)


//Handling Failure

val asuccess= Success(3)
val afailure=(new java.lang.RuntimeException("Super failure"))
println(asuccess)
println(afailure)

val potentisalFailure=Try(unsavemethod())
println(potentisalFailure)
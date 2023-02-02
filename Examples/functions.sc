  object Playground extends App {


  def fun(a: String, b: Int): String = {
    a + " " + b
  }
  println(fun("hello", 3))


 //example of mine
def sum(a: Int , b:Int): Int = {
return a+b

}
  println(sum(20,10))


  def sub(c: Int , d:Int): Int = {
return c-d

}
  println(sub(20,10))

  def div(e: Int , f:Int): Int = {
return e/f

}
  println(div(20,10))

  def mul(g: Int , h:Int): Int = {
   return g*h

}
  println(mul(20,10))

def parameterlessfunction1() : Int = 42
  println(parameterlessfunction1())


  def recursfunc(text : String , n : Int) : String = {
    if (n==1)
       text
    else
       text + recursfunc(text ,n-1)
  }
  println(recursfunc("hello " , 3))

}
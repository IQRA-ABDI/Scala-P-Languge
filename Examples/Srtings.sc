 object Playground extends App {

val name="Iqra"
val age = 19
val speed=1.2f
val greeting = s"hey my name is $name and i am $age years old and i will be turning ${age+1} in this year so nice to meet you"
println(greeting)
println(f"$name%s can eat $speed%2.2f per minute ")


// Some Common String methonds
val greeting = "Hello ,I am iqra ,i live in somalia"
  println(greeting.charAt(2))
  println(greeting.substring(7,11))
  println(greeting.startsWith("Hello"))
  println(greeting.replace(" ", "-"))
  println(greeting.toLowerCase())
  println(greeting.length)
  println(greeting.reverse)
  println(greeting.take(3))
 }
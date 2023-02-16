import scala.quoted.runtime.Patterns.patternType
import scala.annotation.constructorOnly
//pattern matching 
// 1-constants
val x:Any = "scala"
val constants = x match
	case 1 => "a number"
  case "scala" => "THE scala"
  case true => "the truth"
  case AllThePatterns => "A singleton onject"


//2- match anything 
//2.1 - wildcard
val matchgAnything=x match
	case _ =>


//2.2 - variable 
val matchAvariable =x match 
	case something => s"I've found $something"

//3-tuples
val atuble=(1,2)
val matchTuble = atuble match
	case (1,1) =>
  // case (something, 2) => s"I've found $something"


val nastedTuble = (1,(2,3))
val matchANastedTuble = nastedTuble match
	case(_, (2,v)) =>

//PMs can be Nasted

// 4 - case classes - constructor pattern
 val aList:MyList[Int]=Cons(1,Cons(2, Empty))
 val matchAList= aList  match{
   case Empty =>
   case Cons(head, Cons(subhead, subtail))>=
 }

// 5- list patterns
val astandardList=List(1,2,3,42)
val standardListmatching=astandardList match
	case List(1,_,_,_)=> //extractor - advanced
  case List(1,_*)=>//list of arbitrary length - advanced
  case 1 :: List(_)=>//infix pattern
  case List(1,2,3):+ 42=>


// 6 - type specifiers

val unknonw: Any = 2
val unknownMatch = unknonw match {
  case list: List[Int] => //explicit type pattern
  case _ =>
}

// 7- name binding
val namebindingmatch=aList match 
	case nonEmptyList @ Cons(_,_)=>// name binding => use the name later here
  case Cons(1, rest @Cons(2, _))=> // name binding inside nested patterns


// 8-multi-patterns
val multipattern = aList match
	case Empty | Cons(0, _)=> //compound pattern (multipattern)

//9 - if guards
val secondelementspecial=aList match
	case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>






// scala 3 braceless syntex
//if expression
val onlyifExpression= if(2>3)"bigger" else "smaller"

// java-sytle
val onlyonlyifExpression-v2=
if(2>3){
  "bigger"
}
else{
  "smaller"
}

// compact

val onlyifExpression-v3=
  if(2>3)"bigger"
  else "smaller"


// scala 3 
val onlyifExpression-v4=
  if 2 > 3 then
    "bigger" //higher indentation than the if part
  else 
     "smaller"
 

val onlyifExpression-v5 =
  if 2>3 then
     val result = "bigger"
      result
  else 
      val result ="smaller"
      result

def main(args[String]):Unit = {
  println(onlyifExpression)
  println(onlyifExpression-v2)
  println(onlyifExpression-v3)
  println(onlyifExpression-v4)
  println(onlyifExpression-v5)


}
object Expressions extends App{
  
  val x=1+2//Expression
  println(x)
  
  println(1+3*2)
  
  println(1==x)
  
  //==,!=,>= <=
  
  println(!(1==x))
  
  var aVariable=2
  aVariable+=3
  println(aVariable) //-= *= /=
  
  //Instructions(Doing something) and Expressions(Value)
  
  //IF Expression
  
  val aCondition=true
  val acond=if(aCondition) 5 else 3
  println(acond)
  
  //Everything is an Expression in Scala
  
  val aWeirdValue=(aVariable=5)//Unit ==void
  
  println(aWeirdValue)
  
  //code blocks
  val aCodeBlock={
    val y=3
    val x=4
    if(x>y)
      println("Hello")
    else
      println("Bye")
  }
  

  
}

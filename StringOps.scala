object StringOps extends App{
  
  val str:String="Hello, My Name is praveen"
  
  println(str.charAt(2))
  println(str.startsWith("Hello"))
  println(str.substring(3,10))
  println(str.split(" ").toList)
  
  //Scala-specific :String interpolators
  
 //s-interpolator
  
  val name="praveen"
  val age=24
  
  val greetings=s"Hello my name is $name and $age yrs old" //s is the interpolator here
  val b=s"Hi this is $name and i am turning into ${age + 1} this year"
  println(greetings)
  println(b)
  
  //F-Interpolatos
  val speed=1.2f
  val myth=f"$name can eat $speed%2.2f burgers per minute" //2.2f decimal value
  
  println(myth)
  
  //Raw-interpolator
  val msg="Hello there \n Yes i am here"
  println(raw"$msg")
  
  
}

package OOPs

object OOBasics extends App{
  val p= new person("praveen",24) //constructor
  
  println(p.name)
  println(p.x)
  p.greet("Ravi")
  p.greet()
}

class person(val name:String,val age:Int){ //class paremeters are not fields 
  val x=12
  println(1+3)
  
  def greet(name:String):Unit=println(s"${this.name} say's Hi $name")
  
  //Overloading
  def greet():Unit=println(s"Hi i am ${this.name}")
}

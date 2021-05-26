object CBVvsCBN extends App{
  
  def callByValue(x:Long):Unit={
    println("Call by value"+x)
    println("Call by value"+x)
  }
  
  def callByName(x: => Long):Unit={
    println("Call by name"+x)
    println("Call by name"+x)
  }
  
  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}

/*
 * Call by value
 * --value is computed before call
 * --same value used everywhere
 * --def myFuc(x:Int)
 * ----myFuc(2)
 * Call by Name
 * --Expression is passed literally
 * --Expression is evaluated at every single use
 * --def myFuc(x: => Int)
 * ----myFuc(2)
 */

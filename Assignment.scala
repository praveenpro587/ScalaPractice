object Assignment extends App{
  
  /* 
   * A greeting function (name,age)=>"Hi, My name is $name and I am $age years old
   * Factorial Function
   * Fibonacci Function
   * Tests if number is prime
   */
  
  def Greetings(name:String,age:Int):String={
    "Hi ,My name is"+" "+name+" and I am"+" "+age+" years old"
  }
  println(Greetings("praveen",24))
  
  def Factorial(n:Int):Int={
    if(n==0 || n==1) n
    else n*Factorial(n-1)
  }
  println(Factorial(5))
  
  def Fibonacci(n:Int):Int={
    if(n<=1) n
    else Fibonacci(n-1)+Fibonacci(n-2)
  }
  println(Fibonacci(4))
}

object Functions extends App{
  
 def Concat(a: String,b:Int): String={
   a+" "+b
 }
 println(Concat("praveen",87))
 
 def fun():Int=42
 println(fun) //Parameterless function can be called without ()
 
 def StringRepeat(str:String,n:Int):String={
   str*n
 }
 println(StringRepeat("praveen",2))
 
 def Recursive(str:String,n:Int):String={
   if(n==1) str
   
   else str+Recursive(str,n-1)
 }
 print(Recursive("praveen",3))
 
 def UnitReturn(a:String,b:Int):Unit={ //Whenever we are executing side affect
   a*b
 }
 println(UnitReturn("praveen",3))
 
 //Function inside Function
 def ParentFun(n:Int):Int={
   def ChildFunc(a:Int,b:Int):Int={
     a+b
     }
   println(ChildFunc(n,n-1))
   n
 }
 println(ParentFun(5))
}

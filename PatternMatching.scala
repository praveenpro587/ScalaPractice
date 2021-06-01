import scala.util.Random

object PatternMatching extends App{
    val randoms=new Random
    val x=randoms.nextInt(10)
    
    //Switch
    val desc=x match{
        case 1 => "One"
        case 2 => "Two"
        case 3 => "Three"
        case 4 => "Four"
        case _ => "Nothing"
    }
    println(x)
    println(desc)
    
    case class person(name:String,age:Int)
    val p=person("praveen",24)
    
    val greet=p match{
        
        case person(n,a) if a<25 =>s"Hi this is $n and my age is $a so i can't drink"
        case person(n,a)=>s"Hi this is $n and my age is $a"
        case _=>"Nothing"
    }
    println(greet)
}

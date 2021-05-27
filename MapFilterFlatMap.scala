object HelloWorld extends App{
    val list=List(1,2,3)
    
    println(list)
    println(list.head)
    
    //Map
    val mp=list.map(_+1)
    println(mp)
    
    //Filter
    val fi=list.filter(_%2==0)
    println(fi)
    
    //FlatMap
    val pairlist=(x:Int)=>List(x,x+1)
    println(list.flatMap(pairlist))
    
    
    //Assignment
    val num=List(1,2,3,4)
    val chars=List('a','b','c')
    val combinations=num.flatMap(n=>chars.map(c=>c+""+n))//Iterating
    println(combinations)
    
    val nums=List(1,2,3,4)
    val Nchars=List('a','b','c')
    val colors=List("Black","Red")
    
    val combine=nums.flatMap(n=>Nchars.flatMap(c=>colors.map(cl=>""+cl+"-"+c+n)))//Iterating
    
    /*val combine=nums.filter(_%2==0).flatMap(n=>Nchars.flatMap(c=>colors.map(cl=>""+cl+"-"+c+n))*/
    println(combine)
    
    //ForEach
    list.foreach(println)
    
    //for-comprehesion
    val forcombinations=for{
        n<-nums if n%2==0
        c<-Nchars
        color<-colors
    } yield ""+color+"-"+c+n
    
    println(forcombinations)
    
}
      

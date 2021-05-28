object HelloWorld extends App{
    
    val aSeq=Seq(2,1,4)
    println(aSeq.reverse)
    println(aSeq(2))
    println(aSeq ++ Seq(4,5,6))
    println(aSeq.sorted)
    
    //Ranges
    val aRange:Seq[Int]=1 to 10
    aRange.foreach(println)
    
    (1 to 10).foreach(x=>println("Hello"))
    
    //Lists--immutable
    val list=List(1,2,3)
    val prepend=42::list //or 42+:list
    println(prepend)
    val append=list:+53
    println(append)
    
    val fill=List.fill(5)("praveen")
    println(fill)
    
    println(list.mkString("-"))//seperator for list items
    
    //Arrays--Mutable
    
    val array=Array(1,2,3)
    val ele=Array.ofDim[String](3)
    ele.foreach(println)
    
    //Mutation
    array(2)=0
    println(array.mkString(" "))
    
    //arrays and seq
    val numseq:Seq[Int]=array
    println(numseq)
    
    //Vectors
    
    val vector:Vector[Int]=Vector(1,2,3)
    println(vector)
}

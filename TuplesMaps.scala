object TuplesMaps extends App{
    //Tuple
    val tuple=(1,"Hello")
    println(tuple._1)
    println(tuple.copy(_2="Hello Praveen"))
    println(tuple.toString)
    println(tuple.swap)
    
    //Map 
    
    val map:Map[String,Int]=Map()
    
    val phonebook=Map(("Praveen",2121),"Teja"->5344).withDefaultValue(-1)
    //withDefaultValue is useful whenever we are printing key which was not there in map
    println(phonebook)
    
    //Map Operations
    println(phonebook.contains("Praveen"))
    println(phonebook("Teja"))
    println(phonebook("Prakash"))//Here prakash is not there in Map so -1 will print
    
    //Add a paring
    val newparing="NTR"->9999
    val newphonebook=phonebook + newparing//New pair should be  right of plus
    println(newphonebook)
    
    //functions on Map
    //Map,filter,flatMap
    
    println(phonebook.map(x=>x._1.toLowerCase->x._2))
    println(phonebook.map(x=>x._2))
    
    
    //Filter
    println(phonebook.filterKeys(x=>x.startsWith("P")))
    
    //MapValues
    println(phonebook.mapValues(x=>x*10))
    println(phonebook.mapValues(x=>"+91-" + x))
    
    println(phonebook.toList)
    println(List(("venky",64545)).toMap)
    val names=List("Praveen","Teja","Prakash","Ravi","Sanjay")
    println(names.groupBy(x=>x.charAt(0)))
    
    
    
}



class TestScalaBC(args:Array[String]){
  
  def searchFrom():Int={
    var foundIt = false
    var i=0
    while( i<args.length && !foundIt){
        if (!args(i).startsWith("-")){
          if(args(i).endsWith(".scala")){
            foundIt=true
          }
        }
        i=i+1
      }
    i
  }
  
  //recursion Functional Programming
  def searchFrom(i:Int): Int = {
    if(i>=args.length) -1
    else if(args(i).startsWith("-")) searchFrom(i+1)
    else if(args(i).endsWith(".scala")) i
    else searchFrom(i+1)
    
  }
  

  
}
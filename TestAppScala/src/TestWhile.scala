

object TestWhile{
  
  def gcdloop(x:Long,y:Long):Long={
    var a =x
    var b =y
    while(a!=0){
      var temp = a
      a%=b
      b=temp
    }
    b
  }
  def main(args: Array[String]): Unit = {
//    val filename = if(!args.isEmpty) args(0) else "default.txt"
//    println(filename)
    println(gcdloop(3,6))
  }
  
}
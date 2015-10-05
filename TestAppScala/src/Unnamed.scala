

object Unnamed extends App{
  val increase = (x:Int)=>{
    println("It")
    println("is")
    println("so cool")
    x+1
  }
  val numbers = List(1,4,-11,4,6,10)
//  numbers.foreach((x:Int)=>println(x))
  
  println(numbers.filter(x=>x>3))
  
}
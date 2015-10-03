import scala.collection.mutable.Map

class Test3 {
  private var sum=0
  def add(a:Byte): Unit = sum+=a
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object Test3{
  private val cache = Map[String, Int]()
  def calc(str:String): Int = {
    if(cache.contains(str)) cache(str)
    else{
      val test = new Test3
      for(s<-str){
        test.add(s.toByte)  
      }
      val cs = test.checksum
      cache+=(str->cs)
      cs
    }
  }
  
}
object Test3Main extends App{
  println("scala is so cool")
}








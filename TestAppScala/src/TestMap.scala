import scala.collection.mutable.Map

class TestMap {
  private var sum=0
  def add(a:Byte): Unit = sum+=a
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object TestMap extends App{
  private val cache = Map[String, Int]()
  def calc(str:String): Int = {
    if(cache.contains(str)) cache(str)
    else{
      val test = new TestMap
      for(s<-str){
        test.add(s.toByte)  
      }
      val cs = test.checksum
      cache+=(str->cs)
      cs
    }
  }
  println("scala is so cool")
  
}









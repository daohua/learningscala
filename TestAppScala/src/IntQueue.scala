import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get():Int
  def put(x:Int)
}

trait Doubling extends IntQueue{
  abstract override def put(x:Int)=super.put(2*x)
}

trait Filtering extends IntQueue{
  abstract override def put(x:Int)= if(x>0) super.put(x)
}

trait Incrementing extends IntQueue{
  abstract override def put(x:Int)=super.put(x+1)
}


class BasicIntQueue extends IntQueue{
  private val buf = new ArrayBuffer[Int]
  override def get()=buf.remove(0)
  override def put(x:Int)=buf+=x
  
}
object Queue extends App{
  val q1 = new BasicIntQueue with Incrementing with Doubling
  val q2 = new BasicIntQueue with Doubling with Incrementing
  val q3 = new BasicIntQueue with Doubling with Incrementing with Filtering
  
}
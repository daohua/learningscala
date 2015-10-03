
class Rational(n:Int,d:Int){
  require(d!=0)
  private val g = gcd(n,d)
  val num = n/g
  val de =d/g
  override def toString=num+"/"+de
  
  def +(that:Rational)= new Rational(num*that.de+that.num*de, de*that.de)
  def *(that:Rational)=new Rational(num*that.num,de*that.de)
  
  def lessThan(that:Rational) = this.num*that.de<that.num*this.de
  
  def max(that:Rational) = if(lessThan(that)) that else this
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b)
}

object RationalMain extends App{
  val r1 = new Rational(2,6)
  val r2 = new Rational(2,6)
  println(r1+r2)
  
}

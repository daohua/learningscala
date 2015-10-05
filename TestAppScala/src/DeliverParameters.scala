

object DeliverParameters extends App{
  var assertionEnabled = true
  def myAssert(predicate:()=>Boolean)={
    if(assertionEnabled && !predicate())
      throw new AssertionError
  }
  //transfer arithmetic
  def myNameAssert(predicate: =>Boolean) = {
    if(assertionEnabled && !predicate)
      throw new AssertionError
  }
  //transfer value
  def boolAssert(predicate:Boolean)={
    if(assertionEnabled && !predicate)
      throw new AssertionError
  }
  
  println(myAssert(()=>5>3))
  
}
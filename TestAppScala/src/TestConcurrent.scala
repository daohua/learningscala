

object TestConcurrent {
  
  def main(args: Array[String]){
    val data = 1 to(10)
    
    def calculation(number:Int)={
      println( "calculating "+ number )
      Thread.sleep(1000)
      number * 2
    }
    
    val result = data.par.map(calculation) 
    println(result)
  }
  
}
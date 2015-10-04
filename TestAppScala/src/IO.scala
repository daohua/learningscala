import scala.io.Source

object IO {
  
  def main(args: Array[String]): Unit = {
    if(args(0).length()>0){
      for(line <- Source.fromFile(args(0)).getLines()){
        println(line.length+" "+line.substring(0,10))
      }
    }
  }
  
}
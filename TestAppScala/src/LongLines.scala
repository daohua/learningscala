import scala.io.Source

//object LongLines extends App{
//  
//  def processFile(filename:String,width:Int){
//    val lines = Source.fromFile(filename).getLines()
//    for(line<-lines){
//      processLine(filename, line, width)
//    }
//  }
//  
//  private def processLine(filename:String, line:String, width:Int){
//    if(line.length()>width){
//      println(filename+" : "+line.trim)
//    }
//  }
//  
//  processFile("filename", 100)
//  
//}

object ProcessFile{
  def main(args: Array[String]): Unit = {
    
    def processFile(filename:String, width:Int){
      def processLine(line:String){
        if(line.length()>width){
          println(filename+": "+line.trim)
        }
      }
      
      val lines = Source.fromFile(args(0)).getLines()
      for(line<-lines){
        processLine(line)
      }
      
    }
    if(args.length>=2) processFile(args(0), args(1).toInt) else throw new Exception("you must be input two parameters,first is filename and second is Numbber")
    
  }
  
  
}





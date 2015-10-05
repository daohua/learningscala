import java.io.File
import java.io.PrintWriter

object TestConstructure extends App{
  
  def twice(op:Double=> Double, x:Double)= op(op(x))
  //柯里化 function
  def withPrintWriter(file: File)(op:PrintWriter=>Unit){
    val writer = new PrintWriter(file)
    try {
      op(writer)
    }finally{
      writer.close()
    }
  }
//  withPrintWriter(new File("default"), writer=>writer.println(new java.util.Date))
  val file = new File("date.txt")
  withPrintWriter(file){
    writer=>writer.println(new java.util.Date)
  }
  

}
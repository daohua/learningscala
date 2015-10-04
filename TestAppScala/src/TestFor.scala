import java.io.File
import scala.io.Source

object TestFor {
  
  def parseFilename(f:File): String = {
    val fStr = f.getName.split("/")
    fStr(fStr.length-1)
  }
  
  def fileLines(f:File) = Source.fromFile(f).getLines().toList
 
  def main(args: Array[String]): Unit = {
      val files = (new File("../TestAppScala/src")).listFiles()
      
       def grep(pattern:String) = {
         for{
           file<-files
           if file.getName.endsWith("scala")
           line <-fileLines(file)
           trimmed = line.trim()
           if trimmed.matches(pattern) 
           
         } println(file+" "+trimmed)
      }
      grep(".*gcd.*")
      
  }
  
}
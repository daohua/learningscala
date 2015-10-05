import java.io.File

object FilesMatch extends App{
  
    val files = new File(".").listFiles()
    def filesMatching(matcher:(String)=>Boolean)= {
      for(file<-files
          if matcher(file.getName))
        yield file
    }
    
    def filesEnding(query:String)= {
      filesMatching(_.endsWith(query))
    }
    
    def filesContaining(query:String) = {
      filesMatching(_.contains(query))
    }
    
    def filesRegex(query:String) = {
      filesMatching(_.matches(query))
    }
  
  
}
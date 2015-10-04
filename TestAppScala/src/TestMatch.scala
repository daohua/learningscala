

object Main {
  
  def main(args: Array[String]): Unit = {
    
    case class Person(age:Int)
    val person = Option(Person(100))
    val age = person.map(_.age + 5)
    age.getOrElse(throw new Exception);
    
    val person2 : Option[Person] =Option(null)
    val age2 = person2.map(_.age + 2)
    age2.getOrElse(0)
    
    def doStuff(p: Option[Person]) = p match{
      case Some(person) =>println("here id "+ person)
      case None => println("no person")
    }
    
    doStuff(person) 
    doStuff(person2) 
    
    val Something = """(\d+)(.*)""".r
    "123abc" match {
      case Something(age, name) => println(age)
      
    }
    
    
  
  }
}
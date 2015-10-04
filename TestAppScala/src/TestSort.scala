
object TestSort {
  
  def main(args: Array[String]): Unit = {
      val nums:Array[Int] = Array(2,1,5,10,3,7,90,26)
      println(new Sort().quickSort(nums).toList)
    
  }
  
  class Sort(){
    def quickSort(nums:Array[Int]) :Array[Int]= {
      if (nums.length<=1) nums
      else {
        val pivot = nums(nums.length/2)
        Array.concat(
          quickSort(nums filter (pivot >)),
          nums filter (pivot ==),
          quickSort(nums filter (pivot <))
        )
      }
    }
  }
  
  
}